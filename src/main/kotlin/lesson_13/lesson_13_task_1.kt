package lesson_13

/*

Задача 1 к Уроку 13

Для программы телефонного справочника создай класс, который будет хранить имя, номер телефона и поле company.
Номер телефона – целочисленное значение. Нужно учесть ситуацию, что поле с компанией может оставаться незаполненным.
Поля не должны иметь никакой инициализации по умолчанию.

 */

fun main() {}

class UserContacts(
    val name: String,
    val phoneNumber: Int,
    val company: String?,
)