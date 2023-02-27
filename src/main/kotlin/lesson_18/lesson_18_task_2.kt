package lesson_18

/*


Задача 2 к Уроку 18

В игре используются игральные кости с разным количеством граней: 4, 6 и 8.
Опиши их, используя полиморфизм, создав несколько классов.
У каждой кости должен быть метод, печатающий в консоль выпавшее число.

 */

fun main() {

    val smallDice = SmallDice()
    smallDice.diceRoll(4)

    val mediumDice = MediumDice()
    mediumDice.diceRoll(6)

    val bigDice = BigDice()
    bigDice.diceRoll(8)


}

abstract class Dice {

    open fun diceRoll(
        facesNumber: Byte,
    ) {

        println("Бросок кубика с $facesNumber гранями")

    }

}

class SmallDice() : Dice() {

    override fun diceRoll(
        facesNumber: Byte
    ) {

        println("Бросили кубик с $facesNumber гранями и получили ${(1..facesNumber).random()}")

    }

}

class MediumDice() : Dice() {

    override fun diceRoll(
        facesNumber: Byte
    ) {

        println("Запустили куб с $facesNumber гранями и выбили ${(1..facesNumber).random()}")

    }

}

class BigDice() : Dice() {

    override fun diceRoll(
        facesNumber: Byte
    ) {

        println("Куб с $facesNumber гранями показал ${(1..facesNumber).random()}")

    }
}