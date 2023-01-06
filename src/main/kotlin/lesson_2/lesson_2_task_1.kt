package lesson_2

/*
Задача 1 к Уроку 2

Задача на среднее арифметическое. В классе с углубленным изучением английского языка учится 4 человека.
У них следующие баллы по профильному предмету 3, 4, 3, 5.
Пишем часть школьного софта, который посчитает средний балл по английскому для этого класса.

 – Написать выражение, которое высчитывает средний балл;
 – Распечатать результат в консоль;
 – В консоли должно быть выведено дробное с 2 знаками после запятой.
 */

fun main() {

    val firstStudentMark: Byte = 3
    val secondStudentMark: Byte = 4
    val thirdStudentMark: Byte = 3
    val fourthStudentMark: Byte = 5
    val gradePointAverage: Double =
        (firstStudentMark + secondStudentMark + thirdStudentMark + fourthStudentMark).toDouble() / 4

    println("GradePointAverage: $gradePointAverage")

}