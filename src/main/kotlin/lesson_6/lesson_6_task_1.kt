package lesson_6

/*
Задача 1 к Уроку 6

Представим, что на этапе авторизации в приложение, пользователь выбрал сначала зарегистрироваться.
Нужно создать блок программы, который сначала предлагает создать логин и пароль,
затем запрашивает их, чтобы войти в приложение.

Если пароль введен неверно, выводится соответствующее сообщение и данные запрашиваются заново.
Если пароль введен правильно, выводится сообщение – “Авторизация прошла успешно”.
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
    println("Авторизация прошла успешно")
}
