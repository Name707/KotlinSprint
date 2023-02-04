package lesson_12

/*

Задача 4 к Уроку 12

Измени программу таким образом, чтобы информация о погоде выводилась в консоль сразу при создании объекта.

 */

fun main() {
    val weatherYesterday = Weather(15.0, 10.0, true,768)

    weatherYesterday.weatherPrint()

}


class Weather(
    val temperatureAfternoon: Double,
    val temperatureNight: Double,
    rain: Boolean,
    val atmospherePressure: Int,
) {
    init {
        println("Дождь: $rain")
    }
    fun weatherPrint() {
        println(
            """Температура воздуха днем: $temperatureAfternoon
            |Температура воздуха ночью: $temperatureNight
            |Атмосферное давление: $atmospherePressure
            |
        """.trimMargin()
        )
    }
}