package lesson_15

/*

Задача 1 к Уроку 15

В мобильной игре есть разные существа. Напиши интерфейсы для летающих и плавающих существ.

 – создай интерфейсы с методами передвижения для следующих существ: карась, чайка, утка;
 – затем создай для каждого существа классы, реализующие соответствующие интерфейсы;
 – выведи сообщения в консоль, о том как они могут передвигаться.

 */

fun main() {

    val crucianCarp = CrucianCarp()
    crucianCarp.swimming()

    val gull = Gull()
    gull.flying()

    val duck = Duck()
    duck.flying()
    duck.swimming()


}

interface Swim {

    fun swimming() {
        println("It is a swimming animal")
    }

}

interface Fly {

    fun flying() {
        println("It is a flying animal")
    }
}

class CrucianCarp() : Swim {

    override fun swimming() {
        println("Crucian Carp swimming animal")
    }
}

class Gull() : Fly {

    override fun flying() {
        println("Gull flying animal")
    }
}

class Duck() : Fly, Swim {

    override fun flying() {
        println("Duck flying animal")
    }

    override fun swimming() {
        println("Also duck can swim")
    }
}