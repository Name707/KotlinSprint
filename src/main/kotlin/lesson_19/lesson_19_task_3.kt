package lesson_19

/*

Задача 3 к Уроку 19
В игре есть космический корабль. Он может взлетать, приземляться и отстреливаться от астероида.
Задача описать класс и его методы. Требуемая реализация методов нам пока неизвестна.
Один из методов должен содержать явную пометку-напоминание о том, что здесь нужна информация о дополнительной логике.
Другой метод должен вызывать падение программы с ошибкой NotImplementedError.

 */

fun main() {

    val spaceShip = Spaceship()
    spaceShip.landOn()
}

class Spaceship() {

    fun takeOff() {
        // TODO добавить реализацию взлета
    }

    fun landOn() {
        println("Прописать логику приземления корабля")
    }

    fun shoot(): String {
        TODO()
    }
}
