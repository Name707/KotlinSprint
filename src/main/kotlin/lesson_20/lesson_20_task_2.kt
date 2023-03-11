package lesson_20

/*

Задача 2 к Уроку 20
В компьютерной игре игрок может подобрать лечебное зелье, которое восстанавливает всё его здоровье.
Создай класс игрока (у него должно быть имя, текущее и максимальное здоровье).
Затем напиши лямбда- функцию, реализующую лечебное зелье.
Создай экземпляр игрока с неполным здоровьем, примени к нему созданную лямбду-функцию.

 */

fun main() {

    val newPlayer = Player("Name707", 100, 50)
    newPlayer.healing(15)
    println(newPlayer.currentHp)

}

class Player(
    private val name: String,
    private val maxHp: Byte,
    var currentHp: Byte,
) {

    val healing: (Byte) -> Unit = { currentHp = (currentHp + it).toByte() }

}