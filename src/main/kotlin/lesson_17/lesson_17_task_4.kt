package lesson_17

/*

Задача 4 к Уроку 17

Каждый раз, когда посылка прибывает в промежуточный пункт обработки, в программе меняется её местоположение.
Нужно написать класс посылки. Должно быть неизменяемое поле с номером и поле с текущим местоположением в виде строки.

Также должен быть счетчик перемещений, обновляющийся при перезаписи местоположения.

Сымитировать прибытие посылки в новый пункт обработки, протестировать изменение счетчика.
При реализации использовать сеттер.

 */

fun main() {

    val myPackage = Package(
        "R123456789",
        "Китай"
    )

    println(myPackage.movementCounter)
    myPackage.location = "Турция"
    println(myPackage.movementCounter)

}

class Package(
    private val trackNumber: String,
    startLocation: String,
) {

    var movementCounter = 0

    var location = startLocation
        set(value) {
            field = value
            movementCounter++
        }
}