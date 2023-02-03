package lesson_12

/*

Задача 1 к Уроку 12

Создай класс для программы, отслеживающей погоду.
Объекты класса будут хранить температуру днем и ночью, был ли дождь, атмосферное давление.
В этом задании нужно использовать пустой конструктор.

Создай два объекта, присвой им произвольные данные и выведи в консоль одним методом созданного класса.
 – в классе создай переменные и проинициализируй их какими-нибудь значениями;
 – затем в объектах подставь другие значения этим переменным.

 */

fun main() {
    val weatherYesterday = Weather()
    val weatherToday = Weather()

    with(weatherYesterday) {
        temperatureAfternoon = 22.5
        temperatureNight = 15.2
        rain = false
        atmospherePressure = 765
        weatherYesterday.weatherPrint()
    }

    with(weatherToday) {
        temperatureAfternoon = 17.3
        temperatureNight = 10.0
        rain = true
        atmospherePressure = 766
        weatherToday.weatherPrint()
    }
}

class Weather {
    var temperatureAfternoon = 10.0
    var temperatureNight = 10.0
    var rain = true
    var atmospherePressure = 760

    fun weatherPrint(
        _temperatureAfternoon: Double = temperatureAfternoon,
        _temperatureNight: Double = temperatureNight,
        _rain: Boolean = rain,
        _atmospherePressure: Int = atmospherePressure,
    ) {
        println(
            """Температура воздуха днем: $_temperatureAfternoon
            |Температура воздуха ночью: $_temperatureNight
            |Дождь: $_rain
            |Атмосферное давление: $_atmospherePressure
            |
        """.trimMargin()
        )
    }
}