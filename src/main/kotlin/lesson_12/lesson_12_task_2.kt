package lesson_12

/*

Задача 2 к Уроку 12

Измени класс из прошлого задания.
Используй первичный конструктор, затем так же создай 3 объекта и выведи информацию о них.
Поля должны быть объявлены и проинициализированы в теле класса.
 */

fun main() {
    val weatherYesterday = Weather(15.0, 10.0, true, 768)
    val weatherToday = Weather(24.2, 20.1, false, 760)
    val weatherTomorrow = Weather(27.0, 22.5, false, 766)

    weatherYesterday.weatherPrint()
    weatherToday.weatherPrint()
    weatherTomorrow.weatherPrint()
}


class Weather(
    _temperatureAfternoon: Double,
    _temperatureNight: Double,
    _rain: Boolean,
    _atmospherePressure: Int,
) {
    var temperatureAfternoon = _temperatureAfternoon
    var temperatureNight = _temperatureNight
    var rain = _rain
    var atmospherePressure = _atmospherePressure

    fun weatherPrint() {
        println(
            """Температура воздуха днем: $temperatureAfternoon
            |Температура воздуха ночью: $temperatureNight
            |Дождь: $rain
            |Атмосферное давление: $atmospherePressure
            |
        """.trimMargin()
        )
    }
}