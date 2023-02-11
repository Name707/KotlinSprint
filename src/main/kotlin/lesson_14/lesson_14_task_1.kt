package lesson_14

/*

Задача 1 к Уроку 14

В компьютерной игре есть три типа кораблей: стандартные, грузовые и ледоколы.
У всех кораблей свои параметры: название, скорость и т. д. У грузовых скорость меньше, а грузоподъемность больше.
У ледоколов ниже и скорость и вместительность, но они могут колоть лёд.

 – создай класс, стандартный корабль;
 – затем создай экземпляр этого класса и вызови его методы: с какой скоростью движется, сколько перевозит ящиков груза;
 – выведи информацию о свойствах кораблей в консоль.

 */

fun main() {

    val standartShip = StandartShip("Кораблик")
    standartShip.printShipSpeed()
    standartShip.printShipLoadCapacity()

    val cargoShip = CargoShip("Титан")

    val icebreakerShip = Icebreaker("Первопроходец")

    println("""|
        |Свойства корабля "${ standartShip.shipName }":
        |Тип корабля: ${ standartShip.shipType }
        |Скорость: ${ standartShip.shipSpeed }
        |Количество перевозимого груза: ${ standartShip.loadCapacityShip }
        |Способность колоть лёд: ${ standartShip.icebreaker }
        |
        |Свойства корабля "${ cargoShip.shipName }":
        |Тип корабля: ${ cargoShip.shipType }
        |Скорость: ${ cargoShip.shipSpeed }
        |Количество перевозимого груза: ${ cargoShip.loadCapacityShip }
        |Способность колоть лёд: ${ cargoShip.icebreaker }
        |
        ||Свойства корабля "${ icebreakerShip.shipName }":
        |Тип корабля: ${ icebreakerShip.shipType }
        |Скорость: ${ icebreakerShip.shipSpeed }
        |Количество перевозимого груза: ${ icebreakerShip.loadCapacityShip }
        |Способность колоть лёд: ${ icebreakerShip.icebreaker }
    """.trimMargin())
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

        println("Корабль \"$shipName\" может перевезти $loadCapacityShip ящиков груза.")

    }
}

class StandartShip(name: String): Ship() {
    override val shipName: String = name
    override val shipType: String = "Стандартный корабль"
    override val shipSpeed: Byte = 28
    override val loadCapacityShip: Int = 10000
    override val icebreaker: Boolean = false
}

class CargoShip(name: String): Ship() {
    override val shipName: String = name
    override val shipType: String = "Грузовой корабль"
    override val shipSpeed: Byte = 21
    override val loadCapacityShip: Int = 35000
    override val icebreaker: Boolean = false
}

class Icebreaker(name: String): Ship() {
    override val shipName: String = name
    override val shipType: String = "Корабль-ледокол"
    override val shipSpeed: Byte = 15
    override val loadCapacityShip: Int = 7000
    override val icebreaker: Boolean = true
}

