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
        "pass707",
    )
    newUser.userPassword = "newPass"
    println(newUser.userPassword)

    newUser.userLogin = "newLogin"
    println(newUser.userLogin)
}

class User(
    login: String,
    private val password: String,
) {

    var userPassword = password
        set(value) {
            field = if (value == password) value
            else println("Вы не можете изменить пароль").toString()
        }
        get() {
            return field.replace(Regex("[a-zA-Z0-9._-]"), "*")
        }

    var userLogin = login
        set(value) {
            field = value
            println("Пароль успешно изменен")
        }
}