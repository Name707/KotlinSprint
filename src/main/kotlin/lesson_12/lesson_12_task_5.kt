package lesson_12

import kotlin.random.Random.Default.nextBoolean

/*

Задача 5 к Уроку 12

Продолжи усовершенствовать программу, теперь она должна рассчитывать средние значения температур и давления,
и считать количество дождливых дней.
Представь, что данные ты получаешь от датчиков и сымитируй их поведение с помощью random.

 – в функции main() создай список и добавь в него с помощью цикла 10 объектов класса,
 передав в конструкторы случайные значения;
 – для расчета среднего значения температуры создай переменные;
 – пройдись циклом по элементам созданного списка и вычисли средние значения температур,
 а также количество дождливых дней
 – выведи результаты в консоль. На выходе должны получиться средние значения по температуре днем,
 ночью и по среднему атмосферному давлению.

 */

fun main() {

    val days = 10
    val weekWeatherList: MutableList<Weather> = mutableListOf()

    for (item in 1..days) {
        val newDay = Weather(
            (16..30).random(),
            (14..25).random(),
            nextBoolean(),
            (740..780).random(),
        )
        weekWeatherList.add(newDay)
    }

    val averageTemperatureDay = weekWeatherList.map { it.temperatureDaySensor }.average()
    val averageTemperatureNight = weekWeatherList.map { it.temperatureNightSensor }.average()
    val averageRainDays = weekWeatherList.map { it.rainSensor }.count { it }
    val atmospherePressure = weekWeatherList.map { it.atmospherePressureSensor }.average()
    println(
        """Средняя дневная температура: $averageTemperatureDay
        |Средняя ночная температура: $averageTemperatureNight
        |Количество дождливых дней: $averageRainDays
        |Среднее атмосферное давление: $atmospherePressure
    """.trimMargin()
    )
}

class Weather(
    val temperatureDaySensor: Int,
    val temperatureNightSensor: Int,
    val rainSensor: Boolean,
    val atmospherePressureSensor: Int,
)