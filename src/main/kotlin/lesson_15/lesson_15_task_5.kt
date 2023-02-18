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

    val firstTruck = Truck("Грузовой автомобиль")
    val firstCar = Car("Легковой автомобиль")
    val secondCar = Car("Легковой автомобиль")

    firstTruck.carDrive()
    firstTruck.passengersTransportation()
    firstTruck.cargoTransportation()

    firstCar.carDrive()
    firstCar.passengersTransportation()

    secondCar.carDrive()
    secondCar.passengersTransportation()


}

interface Drive {
    val carType: String
    fun carDrive() {
        println("$carType поехал...")
    }
}

interface PassengersTransportation {
    val carPassengersCapacity: Byte

    fun passengersTransportation() {
        println("Перевезено пассажиров: $carPassengersCapacity")
    }
}

interface CargoTransportation {
    val carCargoCapacity: Byte

    fun cargoTransportation() {
        println("Перевезено тонн груза: $carCargoCapacity")
    }
}

class Truck(override val carType: String) : Drive, PassengersTransportation, CargoTransportation {

    override val carPassengersCapacity: Byte = 1
    override val carCargoCapacity: Byte = 2

}

class Car(override val carType: String) : Drive, PassengersTransportation {

    override val carPassengersCapacity: Byte = 3

}