package lesson_6

/*
Задача 4 к Уроку 6

Напиши небольшую консольную игру, в которой нужно угадать число в промежутке от 1 до 9.
Игроку дается 5 попыток, чтобы угадать это число.

Если игрок угадывает число, выводится сообщение – “Это была великолепная игра!”
Если не угадывает, то после истечения попыток выводится сообщение – “Было загадано число N”.
 */

fun main() {

    val winNumber = 7
    var tries = 5

    println("Угадайте число от 1 до 9. Есть $tries попыток")

    do {
        println("Попытка №$tries")
        val userInput = readLine()
        tries--
        if (userInput!!.toInt() == winNumber) println("Это была великолепная игра!")
        else if (userInput!!.toInt() != winNumber && tries == 0) println("Было загадано число $winNumber")
    } while (userInput!!.toInt() != winNumber && tries != 0)


}
