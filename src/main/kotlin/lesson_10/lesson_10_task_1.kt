package lesson_10

/*

Задача 1 к Уроку 10

Напиши небольшую игру, в которой пользователь и компьютер по очереди бросают кости.
Побеждает выбросивший наибольшее число.

 – поочередно выводи сообщение о ходе игрока и компьютера (отображать кто бросил, какие значения на кубиках);
 – бросок костей вынеси в отдельную функцию, в которой генерируются 2 случайных числа от 1 до 6;
 – в отдельные переменные сохрани результат работы функции для игрока и компьютера;
 – после сравнения результатов, выведи соответствующее сообщение в консоль.
 Например: "Победило человечество" или "Победила машина".

 */
fun main() {

    println("Ход человека:")
    val humanity = diceRoller()

    println("Ход компьютера:")
    val computer = diceRoller()
    if (humanity > computer) println("Победило человечество") else println("Победила машина")

}

fun diceRoller(): Int {

    val diceOne = (1..6).random()
    println("Бросок первого кубика: $diceOne")

    val diceTwo = (1..6).random()
    println("Бросок второго кубика: $diceTwo")

    println("""Сумма кубиков ${diceOne + diceTwo}
        |
    """.trimMargin())
    return diceOne + diceTwo
}