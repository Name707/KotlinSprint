package lesson_2

/*
Задача 3 к Уроку 2

Сайт с расписанием поездов получает данные с сервера.
Сервер посылает время выезда и время в пути, а время прибытия вычисляется из них.
Сервер прислал данные, что поезд выехал в 9:39 и будет в пути 457 минут.

 – Создай целочисленные переменные и проинициализируй их этими данными;
 – Напиши программу, которая обработает данные и подсчитает час и минуту прибытия поезда;
 – Выведи результат в консоль.
 */

fun main() {

    val departureTimeHours: Short = 9
    val departureTimeMinutes: Short = 39
    val departureTime: Short = ((departureTimeHours * 60) + departureTimeMinutes).toShort()

    val travelTime: Short = 457

    val arrivalTime: Short = (departureTime + travelTime).toShort()
    val arrivalHours: Short = (arrivalTime / 60).toShort()
    val arrivalMinutes: Short = (arrivalTime % 60).toShort()

    println("Arrival time: $arrivalHours:$arrivalMinutes")


/*   Вариант решения №2

    val departureTimeHours: Short = 9
    val departureTimeMinutes: Short = 39

    val travelTime: Short = 457
    val travelTimeHours: Short = (travelTime / 60).toShort()
    val travelTimeMinutes: Short = (travelTime % 60).toShort()

    val arrivalHours: Short =
        (departureTimeHours + travelTimeHours + (departureTimeMinutes + travelTimeMinutes) / 60).toShort()
    val arrivalMinutes: Short = ((departureTimeMinutes + travelTimeMinutes) % 60).toShort()

    println("Arrival time: $arrivalHours:$arrivalMinutes")
*/
}


/*
Черновик
    val departureTime: String = "9:39"
    val departureToStringList: List<String> = departureTime.split(":")
    val departureToIntList: List<Short> = departureToStringList.map {it.toShort()}

    val travelTime: Short = 457
    val travelToHours: List<Short> = listOf((travelTime / 60).toShort(), (travelTime % 60).toShort())

    val arrivalTime: List<Short> = departureToIntList + travelToHours // Как складывать индексы в новый список попарно?

    println(arrivalTime)

*/
