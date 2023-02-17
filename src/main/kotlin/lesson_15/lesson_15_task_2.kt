package lesson_15

/*

Задача 2 к Уроку 15

Программа, управляющая погодной станцией, должна отправлять сообщения на сервер.
Напиши абстрактный класс базового сообщения с возможностью подключиться к серверу и отправить данные.
Итого будет два метода и одно поле абстрактного класса.
Затем создай подклассы сообщений о температуре и количестве осадков.
Протестируй работу программы.

 */

fun main() {

    val sendPrecipitationMessage = PrecipitationMessage("Осадки в виде снега")
    sendPrecipitationMessage.serverConnection()
    sendPrecipitationMessage.sentText()

    val sendTemperatureMessage = TemperatureMessage("Температура -10'C")
    sendTemperatureMessage.serverConnection()
    sendTemperatureMessage.sentText()

}

abstract class Message(val text: String) {

    fun serverConnection() {
        println("Server connection...")
    }

    fun sentText() {
        println("Отправка сообщения: $text")
    }
}

class PrecipitationMessage(text: String) : Message(text)

class TemperatureMessage(text: String) : Message(text)