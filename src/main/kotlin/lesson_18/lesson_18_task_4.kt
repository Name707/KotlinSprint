package lesson_18

/*

Задача 4 к Уроку 18
В программе хранятся данные о посылках. Нужно написать иерархию классов, описывающих коробки.
Чтобы рассчитывать упаковку для посылок, в классе должен быть метод, возвращающий площадь поверхности посылки.
Если посылка прямоугольная, она должна создаваться с длиной, шириной и высотой.
Если посылка – куб, то только с длиной ребра.

 */

fun main() {


}

abstract class Box() {

    abstract fun boxArea(): Int

}

class Rectangle(
    val length: Int,
    val width: Int,
    val height: Int,
) : Box() {

    override fun boxArea(): Int {

        println("Площадь прямоугольной коробки")
        return 2 * (length * width + length * width + width * height)

    }
}

class Cube(
    val length: Int,
) : Box() {

    override fun boxArea(): Int {

        println("Площадь кубической коробки")
        return 2 * length

    }
}

