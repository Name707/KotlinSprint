package lesson_18

/*

Задача 3 к Уроку 18

В тамагочи есть лиса, собака и кошка. Они могут играть, спать и есть.
Лиса ест ягоды, собака – кости, а кошка – рыбу. У каждого животного есть имя.
Эти действия отображаются в консоли по такому шаблону: “[имя] - [действие]”.

Напиши эти классы, используя полиморфизм и создай по одному экземпляру.

 */

fun main() {

    val fox = Fox("Рыжик")
    fox.play()
    fox.sleep()
    fox.eat()

    val dog = Dog("Чаппи")
    dog.play()
    dog.sleep()
    dog.eat()

    val cat = Cat("Борис")
    cat.play()
    cat.sleep()
    cat.eat()

}

abstract class Animal(
    open val name: String = "",
) {

    open fun play() {
        println("Животное игрет")
    }

    open fun sleep() {
        println("Животное спит")
    }

    open fun eat() {
        println("Животное ест")
    }

}

class Fox(override val name: String = "") : Animal() {

    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест ягоды")
    }

}

class Dog(override val name: String = "") : Animal() {

    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест кость")
    }

}

class Cat(override val name: String = "") : Animal() {

    override fun play() {
        println("$name - игрет")
    }

    override fun sleep() {
        println("$name - спит")
    }

    override fun eat() {
        println("$name - ест рыбу")
    }

}

