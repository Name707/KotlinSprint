package lesson_12

/*

Задача 3 к Уроку 12

Усовершенствуй класс Day. Перепиши его, используя сокращенную запись (без полей внутри тела класса).
Переменной, хранящей информацию о дожде, установи значение по умолчанию.
Информацию о погоде по дням выведи в консоль отдельным методом класса.


 */

fun main() {
    val weatherYesterday = Weather(15.0, 10.0, atmospherePressure = 768)
    val weatherToday = Weather(24.2, 20.1, atmospherePressure = 760)
    val weatherTomorrow = Weather(27.0, 22.5,  atmospherePressure = 766)

    weatherYesterday.weatherPrint()
    weatherToday.weatherPrint()
    weatherTomorrow.weatherPrint()
}


class Weather(
    val temperatureAfternoon: Double,
    val temperatureNight: Double,
    val rain: Boolean = true,
    val atmospherePressure: Int,
) {
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