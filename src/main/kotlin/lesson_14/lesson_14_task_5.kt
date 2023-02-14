package lesson_14

import kotlin.math.pow
import kotlin.math.sin


/*

Задача 5 к Уроку 14

Напиши программу, которая будет описывать геометрические фигуры: круг, прямоугольник и треугольник.
Все фигуры имеют свой цвет, а также свои индивидуальные параметры:
у круга это радиус окружности; у прямоугольника – ширина и высота; у треугольника – длины каждой стороны.

– создай абстрактный класс Figure с полем color;

– у класса Figure определи два абстрактных метода: реализация первого метода должна возвращать площадь фигуры,
а реализация второго – возвращать ее периметр;

– создай 3 класса наследника для фигур Circle, Rectangle и Triangle с соответствующими полями;

– в этих же классах, реализуй методы для каждой из геометрических фигур
(формулы для вычисления площади и периметра можно нагуглить);

– после этого создай по 2 объекта с различными цветами (красный, черный, зеленый)
и произвольными размерами для каждой фигуры;

– наконец, создай 2 метода: первый, принимая на вход список геометрических фигур,
должен вернуть сумму периметров красных фигур; второй, также принимая на вход список,
должен вернуть сумму площадей красных фигур;

– вызови эти два метода с массивом созданных объектов фигур и выведи результат в консоль.

 */

fun main() {

    val firstCircle = Circle("red", 15.0)
    val secondCircle = Circle("black", 5.0)

    val firstRectangle = Rectangle("green", 70.0, 7.0)
    val secondRectangle = Rectangle("red", 20.0, 18.0)

    val firstTriangle = Triangle("black", 5.0, 7.0, 17.0, 30.0)
    val secondTriangle = Triangle("red", 3.0, 1.0, 1.6, 60.0)

    fun sumPerimetersRedFigures(
        getFigures: List<Figure> = listOf(
            firstCircle,
            secondCircle,
            firstRectangle,
            secondRectangle,
            firstTriangle,
            secondTriangle,
        ),
    ): Double {

        val sumPerimetersRedFigures = getFigures
            .filter { it.figureColor == "red" }
            .map { it.figurePerimeter() }
            .sumOf { it }

        return sumPerimetersRedFigures

    }

    fun sumAreasRedFigures(
        getFigures: List<Figure> = listOf(
            firstCircle,
            secondCircle,
            firstRectangle,
            secondRectangle,
            firstTriangle,
            secondTriangle,
        ),
    ): Double {

        val sumAreasRedFigures = getFigures
            .filter { it.figureColor == "red" }
            .map { it.figureArea() }
            .sumOf { it }

        return sumAreasRedFigures

    }

    println("Сумма периметров красных фигур: ${sumPerimetersRedFigures()} \nСумма площадей красных фигур: ${sumAreasRedFigures()}")

}

abstract class Figure {

    abstract val figureColor: String

    abstract fun figurePerimeter(): Double

    abstract fun figureArea(): Double

}

class Circle(
    color: String,
    val radius: Double,
) : Figure() {

    override val figureColor: String = color

    override fun figurePerimeter(): Double {
        return 2 * radius * 3.14
    }

    override fun figureArea(): Double {
        return 2 * 3.14 * radius.pow(2.0)
    }

}

class Rectangle(
    color: String,
    val length: Double,
    val width: Double,
) : Figure() {

    override val figureColor: String = color

    override fun figurePerimeter(): Double {
        return (length + width) * 2
    }

    override fun figureArea(): Double {
        return length * width
    }

}

class Triangle(
    color: String,
    val legSideA: Double,
    val legSideB: Double,
    val baseSideC: Double,
    val angleRadians: Double,
) : Figure() {

    override val figureColor: String = color

    override fun figurePerimeter(): Double {
        return legSideA + legSideB + baseSideC
    }

    override fun figureArea(): Double {
        return 0.5 * legSideA * legSideB * sin(angleRadians / 180 * Math.PI)
    }
}
