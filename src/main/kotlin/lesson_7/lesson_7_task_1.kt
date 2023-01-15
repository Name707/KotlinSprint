package lesson_7

/*
Задача 1 к Уроку 7

Создай программу, которая генерирует шестизначные пароли.
Пусть пароль будет состоять из чередующихся цифр и строчных букв латинского алфавита
(без специальных символов). Например, k5p6m2.

 – для каждого символа необходимо создать отдельную переменную;
 – вывести сгенерированный пароль в консоль;
 – подсказка: использовать метод, который может генерировать рандомное число из заданного диапазона.
 */

fun main() {

    val symbolOne = ('a'..'z').random()
    val symbolTwo = (0..9).random()
    val symbolThree = ('a'..'z').random()
    val symbolFour = (0..9).random()
    val symbolFive = ('a'..'z').random()
    val symbolSix = (0..9).random()

    println("Generated password: $symbolOne$symbolTwo$symbolThree$symbolFour$symbolFive$symbolSix")

}