package lesson_3

/*
Задача 1 к Уроку 3

При входе в приложение высвечивается приветствие.
Представим, что мы пишем функцию,
которая будет выводить приветствие с именем пользователя на экран (в нашем случае в консоль).
Tекст приветствия может меняться в зависимости от времени суток.
(Так, например, выводится приветствие при входе в приложение Сбербанка).

Приветствие и имя пользователя должны храниться в отдельных переменных.
Вывести в консоль два приветствия (для дня и для вечера), перезаписывая данные в одну исходную переменную.
 */

fun main() {

    var greeting: String = ""
    val timeOfDay: List<String> = listOf("daytime", "evening")
    val userName: String = "Name707"

    for (time in timeOfDay) {
        if (time == "daytime") {
            greeting = "Good daytime,"
            println("$greeting $userName!")
        }
        else {
            greeting = "Good evening,"
            println("$greeting $userName!")
        }
    }
    }