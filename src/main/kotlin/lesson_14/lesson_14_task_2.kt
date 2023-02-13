package lesson_14

/*

Задача 2 к Уроку 14

Преобразуй класс из прошлой задачи в родительский и напиши два подкласса, представляющие грузовой корабль и ледокол.
Создай по одному экземпляру каждого класса и вызови их методы.
Придумай для каждого подкласса по 1-2 специализированного свойства.

 – добавь метод для ледокола, что он может колоть лед;
 – выведи в консоль информацию с названием кораблей, с какой скоростью движутся,
 сколько перевозят грузов, и что ледокол колет лед.

 */

fun main() {

    val cargoShip = CargoShip("Титан")
    cargoShip.printShipSpeed()
    cargoShip.printShipLoadCapacity()

    val icebreakerShip = IcebreakerShip("Первопроходец")
    icebreakerShip.printShipSpeed()
    icebreakerShip.printShipLoadCapacity()

    println(
        """|
        |Свойства корабля "${cargoShip.shipName}":
        |Тип корабля: ${cargoShip.shipType}
        |Скорость: ${cargoShip.shipSpeed}
        |Количество перевозимого груза: ${cargoShip.loadCapacityShip}
        |Способность колоть лёд: ${cargoShip.icebreaker}
        |
        |Свойства корабля "${icebreakerShip.shipName}":
        |Тип корабля: ${icebreakerShip.shipType}
        |Скорость: ${icebreakerShip.shipSpeed}
        |Количество перевозимого груза: ${icebreakerShip.loadCapacityShip}
        |Способность колоть лёд: ${icebreakerShip.icebreaker}
        |${ icebreakerShip.icebreakerProperty() }
    """.trimMargin()
    )
// Можно было сделать через список для меньшего кода


}

open class Ship {
    open val shipName: String = ""
    open val shipType: String = ""
    open val shipSpeed: Byte = 0
    open val loadCapacityShip: Int = 0
    open val icebreaker: Boolean = false

    fun printShipSpeed() {

        println("Корабль \"$shipName\" может плыть со скоростью $shipSpeed узлов в час.")

    }

    fun printShipLoadCapacity() {

        println("Корабль \"$shipName\" может перевезти $loadCapacityShip ящиков груза.\n")

    }


}

class CargoShip(name: String) : Ship() {
    override val shipName: String = name
    override val shipType: String = "Грузовой корабль"
    override val shipSpeed: Byte = 21
    override val loadCapacityShip: Int = 35000

    val stormResistance: Boolean = true
    val cargoInsurance: Boolean = true
}

class IcebreakerShip(name: String) : Ship() {
    override val shipName: String = name
    override val shipType: String = "Корабль-ледокол"
    override val shipSpeed: Byte = 15
    override val loadCapacityShip: Int = 7000
    override val icebreaker: Boolean = true

    val standbyEnergySources: Byte = 2

    fun icebreakerProperty(): String {
        return "Корабль способен колоть лёд."
    }
}