package lesson_4

/*
Задача 3 к Уроку 4

В агрокомплексе установлена автоматизированная система анализа выращивания растений.
Напиши программу, которая информирует сотрудников о благоприятных условиях для конкретного вида культур.
Для роста бобовых существует ряд условий, а именно: солнечная погода, раскрытый тент, влажность 20% и время года не зима.

Напиши условие и выведи его результат сообщением такого вида в консоль:
“Благоприятные ли условия сейчас для роста бобовых? true/false”

Данные для сегодняшнего дня (объяви и проинициализируй исходные переменные):
 – солнечная погода;
 – тент раскрыт;
 – влажность 20;
 – время года зима.
 */

fun main() {

    val weather = "солнечная погода"
    val awning = "раскрытый тент"
    val humidity = 20
    val season = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? " +
            "${
                weather == "солнечная погода" &&
                        awning == "раскрытый тент" &&
                        humidity == 20 &&
                        season != "зима"
            }")

}