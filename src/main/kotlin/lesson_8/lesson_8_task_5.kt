package lesson_8

/*
Задача 5 к Уроку 8

Напиши программу, которая должна создавать массив из определенного количества ингредиентов,
которые будет вводить пользователь.
Элементы вводятся по одному. Перед вводом элементов сначала запрашивается количество планируемых ингредиентов.
 */

fun main() {

    println("Введите общее число ингредиентов:")
    val ingredientNumbers = readLine()!!.toInt()

    val arrayIngredients = Array(ingredientNumbers) {""}
    println("Введите $ingredientNumbers ингредиентов:")

    for (item in 0 until ingredientNumbers) {
        val newIngredient = readLine()
        arrayIngredients[item] = newIngredient!!
    }

    print(arrayIngredients.joinToString(", ", "[", "]"))

}