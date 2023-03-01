package lesson_16

/*

Задача 3 к Уроку 16

Создай класс, описывающий пользователя. У него должен быть логин и пароль.
Пароль не должен быть виден в теле главной функции, но должен быть способ проверить, что пароль введен верно.
Выведи информацию о релевантности пароля в консоль.

 */

fun main() {

    val user = User("Name707", "pass808")
    user.comparisonPasswords("wrong pass")
}

class User(
    val userLoginInputed: String,
    val userPassInputed: String,
) {

    fun comparisonPasswords(checkPass: String) {
        if (userPassInputed == checkPass) println("Введенный пароль верный")
        else println("Введенный пароль неверный")
    }
}