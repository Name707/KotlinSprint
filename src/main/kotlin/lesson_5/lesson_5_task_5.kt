package lesson_5

/*
Задача 5* к Уроку 5

Для алгоритма улучшенного приложения-лотереи, нужно угадать два числа от 1 до 100.
Если угадать только одно – игрок получает утешительный приз.

Напиши программу, проверяющую выигрыш. Пользователь должен вводить числа в консоль.
Выйгрышные числа должны меняться при каждом запуске (то есть не должны быть проинициализированы заранее, как в задаче 3).

Точно также надо оформить ввод чисел подсказками, в конце распечатать выйгрышные числа.
 */

fun main() {

    val winningNumbers = listOf((0..100).random(), (0..100).random())

    println("Введите целое число №1 (от 0 до 100:)")
    val userChoiceOne = readLine()

    println("Введите целое число №2 (от 0 до 100:)")
    val userChoiceTwo = readLine()

    if (userChoiceOne == winningNumbers[0].toString() && userChoiceTwo == winningNumbers[1].toString())
        println("Поздравляем! Вы выиграли главный приз!")
    else if (userChoiceOne == winningNumbers[0].toString() || userChoiceTwo == winningNumbers[1].toString())
        println("""Вы выиграли утешительный приз!
    """.trimMargin())
    else println("""Неудача! Крутите барабан!
        |Для победы было необходимо угадать числа ${winningNumbers[0]} и/или ${winningNumbers[1]}
    """.trimMargin())

}