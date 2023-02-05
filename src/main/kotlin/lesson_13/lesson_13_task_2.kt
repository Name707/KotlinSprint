package lesson_13

/*

Задача 2 к Уроку 13

Используй класс из первой задачи.
На его основе создай 2 экземпляра. В одном из контактов вместо номера и компании пропиши null.

Дополни класс методом, который будет печатать информацию о контакте сообщением такого типа:
Имя: Ростислав
Номер: 89123456789
Компания: Reddit

В одном println() и без использования многострочного ввода.
Вместо null значения, в консоль должна выводиться строка [не указано].

 */

fun main() {
    val firstUser = UserContacts("Ростислав", 89123456789, "Reddit")
    val secondUser = UserContacts("Вячеслав", null, null)

    firstUser.userInfoPrinter()
    secondUser.userInfoPrinter()
}

class UserContacts(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {

    fun userInfoPrinter() {
        val nameNullChecker = name ?: "[не указано]"
        val namePhoneNumber = phoneNumber ?: "[не указано]"
        val nameCompanyChecker = company ?: "[не указано]"

        println("Имя: $nameNullChecker \nНомер: $namePhoneNumber \nКомпания: $nameCompanyChecker\n")
    }
}