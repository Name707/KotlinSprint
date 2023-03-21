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

    val phoneBook: MutableList<UserContact> = mutableListOf()

    fun addNewContact() {
        do {
            println("Добавление нового контакта. Введите имя контакта:")
            val newContactName = readln().ifBlank { null }

            println("Введите номер телефона нового контакта:")
            val newContactNumber = readln().ifBlank { null }?.toLong()

            println("Введите компанию нового контакта:")
            val newContactCompany = readln().ifBlank { null }

            if (newContactName != null && newContactNumber != null) phoneBook.add(
                UserContact(
                    newContactName,
                    newContactNumber,
                    newContactCompany
                )
            )
            else if (newContactName == null && newContactCompany == null || newContactNumber != null) phoneBook.add(
                UserContact(newContactName, newContactNumber, newContactCompany)
            )
            println("Если хотите добавить новую запись, введите \'да\'")
            val addNextContactChecker = readln()
        } while (addNextContactChecker.uppercase() == "ДА")

        phoneBook.forEach { it.userInfoPrinter() }
    }
    addNewContact()
}

class UserContact(
    val name: String?,
    val phoneNumber: Long?,
    val company: String?,
) {
    fun userInfoPrinter() {
        val nameNullChecker = name
        val namePhoneNumber = phoneNumber
        val nameCompanyChecker = company
        println("Имя: $nameNullChecker \nНомер: $namePhoneNumber \nКомпания: $nameCompanyChecker\n")
    }
}