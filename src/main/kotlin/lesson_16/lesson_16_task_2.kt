package lesson_16

import kotlin.math.pow

/*

Задача 2 к Уроку 16

Создай класс, описывающий круг.
У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
Число Pi должно быть равным 3,14 и защищенным от изменений.
Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.

 */

fun main() {

    val circle = Circle(10.0)
    println("Периметр = ${circle.circlePerimeter()}")
    println("Площадь = ${circle.circleArea()}")

}

class Circle(
    protected val radius: Double
) {

    private val numberPi = 3.14

    fun circlePerimeter(): Double {
        return 2 * radius * numberPi
    }

    fun circleArea(): Double {
        return 2 * numberPi * radius.pow(2.0)
    }
}