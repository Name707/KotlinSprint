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

    println("Регистрация. Придумайте логин:")
    val checkInLogin = readLine()

    println("Регистрация. Придумайте пароль:")
    val checkInPassword = readLine()

    println("Введите логин:")
    val inputLogin = readLine()

    println("Введите пароль:")
    val inputPassword = readLine()

    if (inputLogin == checkInLogin && inputPassword == checkInPassword) println("Авторизация прошла успешно")

    if (inputLogin != checkInLogin) println("Неверный логин")

    while (inputLogin == checkInLogin && inputPassword != checkInPassword) {
        println("Неверный пароль. Введите пароль еще раз:")
        val newTryPassword = readLine()
        if (newTryPassword == checkInPassword) {
            println("Авторизация прошла успешно")
            break
        }
    }
}