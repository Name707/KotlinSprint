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

    println("Введите 5 ингредиентов с маленькой буквы:")

    val userIngredients = mutableListOf<String>()
    for (item in 1..5) {
        println("Введите ингредиент №$item")
        userIngredients.add(readln())
    }

    userIngredients.sort() // Сортировка списка

    val excludeRepeat = userIngredients.toSet().toList().joinToString(postfix = ".") // Исключаем повторы и добавляем postfix
    val result = excludeRepeat[0].toString().replaceRange(0..0, excludeRepeat[0].uppercase()) + excludeRepeat.removeRange(0..0)  // Заглавная буква выбранного элемента*/

    println(result)
}