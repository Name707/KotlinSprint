package lesson_7

/*
Задача 3 к Уроку 7

Создай программу, которая выводит все чётные числа от нуля до числа, введенного пользователем.
Сначала нужно вывести в консоль запрос на ввод числа.
Полученное число сохраняем в отдельную переменную. В решении должна использоваться прогрессия.
 */

fun main() {

    println("Ведите целое число:")
    val userInput = readLine()!!.toInt()

    for (number in 0..userInput) {

        if (number % 2 == 0) println(number)

    }

}