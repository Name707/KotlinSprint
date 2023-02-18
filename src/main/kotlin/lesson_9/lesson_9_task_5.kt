package lesson_9

/*

Задача 5 к Уроку 9

Напиши программу, которая запрашивает у пользователя пять названий ингредиентов (каждый по отдельности).

 – результат должен исключать повторы;
 – список должен выводиться в алфавитном порядке;
 – все элементы списка выведены в одну строку, разделяя слова запятыми;
 – первое слово должно быть напечатано с заглавной буквы, в конце списка должна стоять точка.

 */

fun main() {

    val userCombo = mutableListOf<String>()
    println("Введите 5 ингредиентов:")

    for (item in 1..5) {
        println("Введите ингредиент №$item")
        userCombo.add(readln())
    }

    userCombo.sort() // Сортировка списка

    val userFirstItem = userCombo[0] // Выбираем первый элемент списка
    val firstItemFirstChar = userCombo[0].replaceRange(0..0, userFirstItem[0].uppercase()) // Заглавная буква выбранного элемента

    val convertResult = userCombo.toSet().joinToString(postfix = ".") // Исключаем повторы и добавляем postfix
    val result = convertResult.replaceRange(0..0, firstItemFirstChar) // Заменяем первый элемент

    println(result)

    println("""
        |https://www.youtube.com/watch?v=mJ5t1Oe8Gzo
        | https://www.youtube.com/watch?v=z5BO5tgbL8s
    """.trimMargin())
}