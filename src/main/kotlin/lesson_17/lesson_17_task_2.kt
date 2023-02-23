package lesson_17

/*

Задача 2 к Уроку 17

Нужно написать класс для корабля в мобильной игре.
У корабля есть имя, средняя скорость и порт приписки.
Имя корабля менять нельзя, при попытке перезаписать имя в консоль должно выводиться предупреждение.
Создать экземпляр класса и протестировать работу.

 */

fun main() {

    val ship = Ship(
        "Титан",
        20,
        "Архангельск",
    )

    println(ship.name)
    ship.shipName = "Маяк"
    println(ship.name)

}

class Ship(
    val name: String,
    val speed: Byte,
    val port: String,
) {

    var shipName: String
        get() = name
        set(value) {
            println("Изменить имя корабля невозможно.")
        }
}