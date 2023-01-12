package lesson_5

/*
Задача 3 к Уроку 5

Для алгоритма простого приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз. Напиши программу, проверяющую выигрыш.

Пользователь должен вводить числа в консоль.
Правильные числа заранее известны и хранятся в переменных.
Оформить ввод текстовыми подсказками о том, что нужно вводить.
Вывести отдельным сообщением, какие числа были нужны для победы.

 – Если оба числа угаданы вывести “Поздравляем! Вы выиграли главный приз!”
 – Если угадано только одно число, вывести “Вы выиграли утешительный приз!”
 – Если не угадано ничего, вывести “Неудача! Крутите барабан!”
 */
private const val numberOne = 70
private const val numberTwo = 7

fun main() {

    println("Введите целое число №1 (от 0 до 100:)")
    val userChoiceOne = readLine()!!.toInt()

    println("Введите целое число №2 (от 0 до 100:)")
    val userChoiceTwo = readLine()!!.toInt()

    if (userChoiceOne == numberOne && userChoiceTwo == numberTwo) println("Поздравляем! Вы выиграли главный приз!")
    else if (userChoiceOne == numberOne || userChoiceTwo == numberTwo) println("Вы выиграли утешительный приз!")
    else println("""Неудача! Крутите барабан!
        |Для победы было необходимо угадать числа $numberOne и/или $numberTwo
    """.trimMargin())

}