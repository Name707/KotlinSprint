package lesson_20

/*

Задача 3 к Уроку 20
В игре есть запертая дверь. Игрок должен найти ключ. Нужно написать лямбда-функцию, которая будет проверять,
есть ли у игрока ключ. Если ключ есть, нужно вывести сообщение, что игрок дверь открыл, иначе – что дверь заперта.
Для проверки работы функции нужно написать класс игрока, в котором будет храниться информация о наличии ключа.

 */

fun main() {

    val newPlayer = Player("Name707", true)

    val haveKey: (Boolean) -> Unit = { key: Boolean -> String
    if (key) println("У ${newPlayer.name} ЕСТЬ ключ") else println("У ${newPlayer.name} НЕТ ключа")
    }
    haveKey(newPlayer.key)

}

class Player(
    val name: String,
    val key: Boolean,
)