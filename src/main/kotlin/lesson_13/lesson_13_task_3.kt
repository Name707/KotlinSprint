package lesson_13

/*

Задача 3 к Уроку 13

Для того чтобы взаимодействовать со всеми записями телефонной книги, как с одним целым, их нужно объединить в список.

Создай пустой список, добавь в него несколько объектов, инициализируя их с разнообразными данными (в том числе и null).

Напиши функцию, которая будет выводить имя, номер телефона и компанию.
Если какого-либо значения нет – программа должна заменить его на строку [не указано].
С помощью этой функции выведи в консоль все объекты из списка.

 */

fun main() {

    val phoneBook: MutableList<UserContact> = mutableListOf()
    phoneBook.add(UserContact("Ростислав", 89123456789, "Reddit"))
    phoneBook.add(UserContact("Вячеслав", null, "GitHub"))
    phoneBook.add(UserContact("Анна", 81561211651, null))

    for (item in phoneBook) item.userInfoPrinter()

}

class UserContact(
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