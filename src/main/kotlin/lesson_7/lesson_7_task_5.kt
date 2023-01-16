package lesson_7

/*
Задача 5 к Уроку 7

Создай программу, которая генерирует более сложные пароли.

 – пароль должен содержать цифры, строчные и заглавные буквы;
 – цифры и буквы должны располагаться в случайном порядке;
 – длина пароля должна задаваться пользователем
 */

fun main() {

    println("Введите длину пароля:")
    val userInput = readLine()!!.toInt()

    println("Ваш новый пароль:")

    for (item in 1..userInput) {
        val list = listOf(
            ('a'..'z').shuffled().random(),
            ('a'..'z').shuffled().random().uppercase(),
            (0..9).shuffled().random(),
        ).shuffled()
        print(list.random())
    }
}