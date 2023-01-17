package lesson_8

/*
Задача 3 к Уроку 8

Скопируй предыдущее задание.
Нужно изменить код, чтобы проверить, есть ли ингредиент в рецепте, но не используя циклы для поиска.

 */

fun main() {

    val chickenSoup = arrayOf("tomato", "potato", "onion", "chicken", "salt")

    println("Enter ingredient")
    val ingredientCheck = readLine()

    if (chickenSoup.contains(ingredientCheck)) println("Ингредиент $ingredientCheck в рецепте есть")
    else println("Такого ингредиента нет.")


}