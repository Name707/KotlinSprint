package lesson_1

/*
Задача 5* к Уроку 1

Объяви переменную с количеством секунд, которые Гагарин провел в космосе.

 – Переведи количество секунд в целые минуты и сохрани в новую переменную;
 – Выведи в консоль время, проведенное в космосе в формате [минуты:секунды], например так: 01:09;
 – Значения секунд отображать двумя цифрами.
 */

fun main() {

    val seconds: Short = 6480
    val secondsToMinutes: Int = seconds / 60
    val remainderOfDivision: Int = seconds % 60
    println("$secondsToMinutes:" + String.format("%02d", remainderOfDivision))

}