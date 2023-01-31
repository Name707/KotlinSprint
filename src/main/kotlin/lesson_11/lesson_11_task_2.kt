package lesson_11

/*

Задача 2 к Уроку 11

Возьми класс User из первой задачи. Добавь к классу новое необязательное свойство bio и несколько методов.
Нам нужно иметь возможность посмотреть информацию о пользователе, заполнить описание профиля,
изменить пароль и отправить письмо на почту.

 – 1 метод должен выводить информацию о пользователе в консоль;
 – 2 метод должен считывать с консоли информацию о себе и сохранять в поле bio;
 – 3 метод изменения пароля сначала должен запросить текущий пароль, и, если он введен верно, запросить новый,
 изменить его и сообщить, что пароль изменен;
 – 4 метод будет принимать строку с текстом, который мы хотим “отправить” пользователю –
 метод должен печатать сообщение в консоль.

Далее создай объект, заполни информацию “о себе” (методом чтения с консоли) и измени пароль.
Затем, проверь изменения и отправь сообщения на почту (в качестве обращения использовать логин),
вызывая соответствующие методы.

 */

fun main() {

    val userSevenZeroSeven = User(707, "Name707", "password", "707VLAN@gmail.com")

    userSevenZeroSeven.printUserInfo()

    userSevenZeroSeven.addUserBio()

    userSevenZeroSeven.createNewPassword()

    userSevenZeroSeven.sendMail()

}

class User(val userId: Int, val userLogin: String, var userPass: String, val userEmail: String) {

    var bio = ""
    fun printUserInfo() {
        println(
            """UserOne: 
        |id:$userId
        |Login: $userLogin
        |Password: $userPass
        |E-mail: $userEmail
        |
    """.trimMargin()
        )
    }

    fun addUserBio(): String {
        println("Введите информация о себе:")
        bio = readln()
        println("Добавлена информация о себе: $bio")
        return bio
    }

    fun createNewPassword() {
        println("Смена пароля. Введите старый пароль:")
        do {
            val oldPass = readln()
            if (oldPass == userPass) println("Введите новый пароль:")
            else println("Неправильный пароль. Введите старый пароль:")
        } while (oldPass != userPass)
        userPass = readln()
        println("Пароль изменен. Новый пароль:$userPass")
    }

    fun sendMail() {

        println("Введите содержимое электронного сообщения:")
        val newMail = readln()

        println("""Сообщение: Ув. $userLogin, $newMail
            |Ваши данные с учетом изменений:
        |id:$userId
        |Login: $userLogin
        |Password: $userPass
        |E-mail: $userEmail
        """.trimMargin())

    }
}