package lesson_7

/*
Задача 4 к Уроку 7

Cоздай таймер, который сперва запрашивает у пользователя количество секунд, которые нужно засечь.

 – таймер должен показывать каждую секунду, сколько времени осталось до конца;
 – по истечении времени, вывести сообщение в консоль: “Время вышло”;
 – таймер должен быть написан, используя цикл for.
 */

fun main() {

    println("Введите засекаемое время")
    val userInput = readLine()!!.toLong()

    var timerStart = 0

    do {
        for (item in userInput downTo 0) {
            Thread.sleep(1000)
            println("""Прошло: $timerStart
                |Осталось секунд: $item""".trimMargin())
            timerStart++
        }
    } while (Thread.interrupted())
    println("Время вышло")

}