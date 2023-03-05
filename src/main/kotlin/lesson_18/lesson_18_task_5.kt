package lesson_18

/*

Задача 5 к Уроку 18
В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...)

 */

fun main() {

    val point = Screen("Точка")
    point.draw(Point(), 0.6268F, 1.55797F)

    val square = Screen("Квадрат")
    square.draw(Square(), 2, 5)

    val circle = Screen("Круг")
    circle.draw(Circle(), 5F, 6.041F)

}

class Point {

    fun draw() {}

}

class Square {

    fun draw() {}

}

class Circle {

    fun draw() {}

}

class Screen(
    val shapeType: String,
) {

    fun draw(shape: Point, coordinateX: Float, coordinateY: Float) {
        println("Создана $shapeType с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Square, coordinateX: Int, coordinateY: Int) {
        println("Создан $shapeType с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Circle, coordinateX: Float, coordinateY: Float) {
        println("Создан $shapeType с центром: [$coordinateX, $coordinateY]")
    }

}
