package lesson_18

/*

Задача 5 к Уроку 18
В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...)

 */

fun main() {

    val point = Screen()
    point.draw(Point(), 0.6268F, 1.55797F)

    val square = Screen()
    square.draw(Square(), 2, 5)

    val circle = Screen()
    circle.draw(Circle(), 5F, 6.041F)

}

class Point : Screen()

class Square : Screen()

class Circle : Screen()

open class Screen {

    fun draw(shape: Point, coordinateX: Float, coordinateY: Float) {
        println("Создана ТОЧКА с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Point, coordinateX: Int, coordinateY: Int) {
        println("Создана ТОЧКА с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Square, coordinateX: Int, coordinateY: Int) {
        println("Создан КВАДРАТ с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Square, coordinateX: Float, coordinateY: Float) {
        println("Создан КВАДРАТ с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Circle, coordinateX: Float, coordinateY: Float) {
        println("Создан КРУГ с центром: [$coordinateX, $coordinateY]")
    }

    fun draw(shape: Circle, coordinateX: Int, coordinateY: Int) {
        println("Создан КРУГ с центром: [$coordinateX, $coordinateY]")
    }
}


