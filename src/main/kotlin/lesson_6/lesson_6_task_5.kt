package lesson_6

/*
Задача 5 к Уроку 6

Доработка задачи на авторизацию. Нужно написать часть модуля для авторизации пользователя.
Для входа в приложение пользователь должен доказать, что он не бот.
Для этого программа предлагает решить простой математический пример – сложить два числа.
Имитируй эти действия в консоли, путем считывания данных с клавиатуры.

При успешном решении вход в программу символизируется сообщением “Добро пожаловать!".
Дай пользователю три попытки пройти тест.
Для этого придется каждый раз генерировать новый математический пример и предлагать решить его заново.

Для простоты ограничься примерами на сложение с использованием цифр от 1 до 9.
Если три попытки оказались неудачными, вывести сообщение "Доступ запрещен".
 */

fun main() {

    println("Создайте логин")
    val logUser = readLine()
    println("Придумайте пароль")
    val passUser = readLine()
    println("Регистрация прошла успешно")

    do {
        println("Введите логин")
        val logEnter = readLine()
        println("Введите пароль")
        val passEnter = readLine()
    } while (logEnter != logUser || passEnter != passUser)

    var tries = 3

    do {

        val botInspector = listOf((1..9).random(), (1..9).random())

        println("""Подтвердите, что Вы не робот.
        |Введите правильный ответ: ${botInspector[0]} + ${botInspector[1]} =
        |Попытка №$tries""".trimMargin())

        tries--
        val userInput = readLine()

        if (userInput!!.toInt() == botInspector[0] + botInspector[1]) println("Добро пожаловать!")
        else if (userInput!!.toInt() != botInspector[0] + botInspector[1] && tries == 0) println("Доступ запрещен")
    } while (userInput!!.toInt() != botInspector[0] + botInspector[1] && tries != 0)
}