package lesson_19

/*

Задача 5 к Уроку 19
Разрабатываем приложение “Картотека”. Пользователь вводит имя и пол человека. Данные картотеки хранятся в списке.
Человека описывает класс, содержащий имя и пол. Пол должен храниться в enum.
После ввода 5 человек, список выводится в консоль. При старте приложения печатается инструкция в каком формате вводить
имя и пол (и какие значения полов доступны).

 */

fun main() {

    val file: MutableList<Person> = mutableListOf()

    println("Заполните файл пятью пользователями. Введите имя и гендер(male/female) через \"Enter\"")

    repeat(5) {

        println("Введите пользователя №${it + 1}")

        val getName = readln()
        val getGender = readln()
        val newPerson = Person(getName, Gender.valueOf(getGender.uppercase()))
        file.add(newPerson)

    }

    file.forEach { println("${it.name}, ${it.gender}") }

}

enum class Gender {

    MALE,
    FEMALE,

}

class Person(
    val name: String,
    val gender: Gender,
)