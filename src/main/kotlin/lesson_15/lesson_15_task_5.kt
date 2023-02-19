package lesson_15

/*

Задача 5 к Уроку 15

В компьютерной игре есть грузовые и легковые автомобили.
Напиши интерфейсы, обеспечивающие передвижение машин, перевозку пассажиров и перевозку грузов.
Грузовые машины могут перевозить одного пассажира и 2 тонны груза, легковые – трех пассажиров.
Сообщения о действиях выведи в консоль. Создай классы и несколько объектов.
Вызови их методы, «перевезя» таким образом 6 человек и 2 тонны груза.

 */

fun main() {

    val firstTruck = Truck(
        "Грузовой автомобиль",
        1,
        2,
    )
    val firstCar = Car(
        "Легковой автомобиль",
        3
    )
    val secondCar = Car(
        "Легковой автомобиль",
        3
    )

    firstTruck.carDrive()
    firstTruck.passengersTransportation()
    firstTruck.cargoTransportation()

    firstCar.carDrive()
    firstCar.passengersTransportation()

    secondCar.carDrive()
    secondCar.passengersTransportation()


}

interface Movable {
    val carType: String
    fun carDrive() {
        println("$carType поехал...")
    }
}

interface PeopleTransportable {
    val carPassengersCapacity: Byte

    fun passengersTransportation() {
        println("Перевезено пассажиров: $carPassengersCapacity")
    }
}

interface CargoTransportable {
    val carCargoCapacity: Byte

    fun cargoTransportation() {
        println("Перевезено тонн груза: $carCargoCapacity")
    }
}

class Truck(
    override val carType: String,
    override val carPassengersCapacity: Byte = 1,
    override val carCargoCapacity: Byte = 2,
) : Movable, PeopleTransportable, CargoTransportable

class Car(
    override val carType: String,
    override val carPassengersCapacity: Byte = 3,
) : Movable, PeopleTransportable