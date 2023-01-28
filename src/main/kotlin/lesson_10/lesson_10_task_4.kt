package lesson_10


/*

Задача 4 к Уроку 10

Усовершенствуй игру, где пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число. Теперь дай возможность пользователю играть до тех пор пока ему не надоест.
В конце программа должна вывести сколько партий он выиграл.

 – логика бросков должна быть реализована по примеру из задачи 1;
 – после первого раунда программа задает вопрос: “Хотите бросить кости еще раз Введите Да или Нет”;
 – программа в зависимости от ответа запускает новый раунд или заканчивает игру
 с выводом количества выйгрышных партий человека;
 – в программе должно быть минимум 2 метода (для проведения раунда и для генерации значений брошенных кубиков).

 */

fun main() {

    val humanWinsInit = 0

    val counterHumanWins = startRound(humanWinsInit)
    println("Игра окончена, выигрышей человека: $counterHumanWins")

}

fun diceRoll(): Int {

    val diceOne = (1..6).random()
    println("Бросок первого кубика: $diceOne")

    val diceTwo = (1..6).random()
    println("Бросок второго кубика: $diceTwo")

    println(
        """Сумма кубиков ${diceOne + diceTwo}
        |
    """.trimMargin()
    )
    return diceOne + diceTwo
}

fun startRound(wins: Int): Int {

    var humanWins = wins

    do {
        println("Ход человека:")
        val humanity = diceRoll()

        println("Ход компьютера:")
        val computer = diceRoll()

        if (humanity > computer) {
            println("Победило человечество")
            humanWins++
        } else println("Победила машина")
        println("Хотите бросить кости еще раз Введите Да или Нет")
        val nextOrStop = readln().uppercase()
    } while (nextOrStop != "НЕТ")
    return humanWins

}
