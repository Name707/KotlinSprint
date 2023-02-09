package lesson_13

/*
Задача 4 к Уроку 13

Допиши функцию, для программы, которая позволит пользователю добавлять записи в телефонную книгу.
Функция должна валидировать следующие случаи: пользователь ввел имя и номер,
пользователь не ввел имя или компанию (вместо пустой строки должен быть null),
пользователь не ввел номер телефона (такая запись не должна добавляться).

После добавления первой записи, пользователя спрашивают “Если хотите добавить новую запись, введите \“да\””.
В любом другом случае функция завершает работу. Программа должна добавлять столько записей, сколько пользователю нужно,
а затем печатать все записи в консоли в компактном виде.

*/


fun main() {

    val addContacts: MutableList<UserContact> = mutableListOf(UserContact())
    addContacts.forEach { it.addNewUserContact() }

}

class UserContact(
    val name: String? = null,
    val phoneNumber: String? = null,
    val company: String? = null,
) {
    fun addNewUserContact(): MutableList<UserContact> {

        val phoneBookList: MutableList<UserContact> = mutableListOf()

        do {
            println("Добавление контакта. Введите через \"Enter\" имя, номер и компанию контакта:")

            val addContact = UserContact(
                readln().ifBlank { null },
                readln().ifBlank { null },
                readln().ifBlank { null },
            )

            if ((addContact.name != null && addContact.phoneNumber != null) ||
                (addContact.name == null || addContact.company == null)
            ) phoneBookList.add(addContact)

            println("Если хотите добавить новую запись, введите \"да\"")
            val addNextContactChecker = readln()

        } while (addNextContactChecker.uppercase() == "ДА")
        phoneBookList.forEach { println("Контакт: ${it.name}, ${it.phoneNumber}, ${it.company}") }
        return phoneBookList
    }
}