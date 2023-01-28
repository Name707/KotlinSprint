package lesson_11

/*

Задача 1 к Уроку 11

Создай класс, который будет хранить данные пользователя.
В свойствах должна храниться информация об уникальном идентификаторе, логине, пароле и почте.
Названием может быть, например, User. Создай два экземпляра класса с произвольными данными и выведи их в консоль.

 */

fun main() {

    val userOne = User(707, "Name707", "password", "707VLAN@gmail.com")
    val userTwo = User(6464, "Name100", "pass", "100VLAN@gmail.com")

    println("""UserOne: 
        |id:${userOne.userId}
        |Login: ${userOne.userLogin}
        |Password: ${userOne.userPass}
        |E-mail: ${userOne.userMail}
        |
    """.trimMargin())

    println("""UserTwo: 
        |id:${userTwo.userId}
        |Login: ${userTwo.userLogin}
        |Password: ${userTwo.userPass}
        |E-mail: ${userTwo.userMail}
    """.trimMargin())

}

class User(val userId: Int, val userLogin: String, val userPass: String, val userMail: String) {}