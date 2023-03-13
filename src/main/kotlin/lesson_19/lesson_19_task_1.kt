package lesson_19

/*

Задача 1 к Уроку 19
В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish).
Напиши enum класс, перечисляющий этих рыб.
Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.

 */

fun main() {

    val fishes = listOf("guppy", "angelfish", "Goldfish", "SiameseFightingFish")
    for (i in fishes) {
        when (i) {
            Fish.GUPPY.id -> getFishName(Fish.GUPPY)
            Fish.ANGELFISH.id -> getFishName(Fish.ANGELFISH)
            Fish.GOLDFISH.id -> getFishName(Fish.GOLDFISH)
            Fish.SIAMESE_FIGHTING_FISH.id -> getFishName((Fish.SIAMESE_FIGHTING_FISH))
        }
    }
}

enum class Fish(val id: String) {
    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("SiameseFightingFish"),
}

fun getFishName(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("Можно добавить Гуппи")
        Fish.ANGELFISH -> println("Можно добавить Скалярий")
        Fish.GOLDFISH -> println("Можно добавить Золотых рыбок")
        Fish.SIAMESE_FIGHTING_FISH -> println("Можно добавить Петушков")
    }
}
