package lesson_17

/*

Задача 5 к Уроку 17

Написать класс, описывающий пользователя. У него есть логин и пароль.
При попытке изменить пароль в консоль должно выводиться «Вы не можете изменить пароль».
При попытке прочитать его – вместо букв должны отображаться звездочки (по количеству символов пароля).
При изменении логина в консоли должно печататься сообщение об успешной смене логина.

Создай пользователя с произвольными данными и протестируй изменение логина и пароля.
Вся реализация должна быть на сеттерах и геттерах.

 */

fun main() {

    val newUser = User(
        "User707",
        "validPassSSSSSSSSSSSSS",
    )
    newUser.userPassword = "WrongPass"
    println(newUser.userPassword)

    newUser.userLogin = "newLogin"
    println(newUser.userLogin)
}

class User(
    login: String,
    private val password: String,
) {

    var userPassword = password
        set(value) = println("Вы не можете изменить пароль")
        get() = "*".repeat(field.length)

    var userLogin = login
        set(value) {
            field = value
            println("Логин успешно изменен")
        }
}