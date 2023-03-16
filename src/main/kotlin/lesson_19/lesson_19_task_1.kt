package lesson_19

/*

Задача 1 к Уроку 19
В симуляторе аквариума есть 4 вида рыб. Гуппи (guppy), скалярия (angelfish), золотая рыбка (Goldfish),
петушок (Siamese fighting fish).
Напиши enum класс, перечисляющий этих рыб.
Сообщи пользователю, каких рыб он может добавить в свой аквариум, распечатав список в консоль.

 */

fun main() {

    for (fish in Fish.values()) {
        println("Можно добавить ${fish.id}")
    }
}

enum class Fish(val id: String) {
    GUPPY("guppy"),
    ANGELFISH("angelfish"),
    GOLDFISH("Goldfish"),
    SIAMESE_FIGHTING_FISH("SiameseFightingFish"),
}

