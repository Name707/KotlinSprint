package lesson_18

/*

Задача 4 к Уроку 19
В компьютерной игре танк может подбирать разные виды патронов. Патроны различаются силой удара.
Синие – 5 единиц, зеленые – 10, красные – 20.
– создай enum класс для патронов и класс танка. У танка должны быть методы вооружения новым типом патронов и выстрела.
При выстреле в консоль должен выводиться нанесенный урон;
– создай экземпляр танка и “произведи” несколько выстрелов разными патронами;
– в решении должен использоваться enum.

 */

fun main() {

    val tank = Tank()
    tank.changeAmmo(Ammunition.RED_AMMO)
    tank.shoot()

    tank.changeAmmo(Ammunition.GREEN_AMMO)
    tank.shoot()


}

enum class Ammunition {
    BLUE_AMMO,
    GREEN_AMMO,
    RED_AMMO,
}

class Tank {

    private var currentAmmo: Ammunition? = null

    fun changeAmmo(ammo: Ammunition) {

        currentAmmo = ammo

    }

    fun shoot() {
        when (currentAmmo) {
            Ammunition.BLUE_AMMO -> println("Выстрел синими боеприпасами (5 ед. урона)")
            Ammunition.GREEN_AMMO -> println("Выстрел зелеными боеприпасами (10 ед. урона)")
            Ammunition.RED_AMMO -> println("Выстрел красными боеприпасами (20 ед. урона)")
            else -> println("Орудие не заряжено")
        }
    }
}