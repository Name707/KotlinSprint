package lesson_16

/*

Задача 5 к Уроку 16

Для компьютерной игры создать класс игрока. У него есть имя, здоровье и сила удара.
Здоровье должно изменяться только через методы получения урона и лечения.

Добавить приватный метод death(), который вызывается, если при получении урона заканчивается здоровье.
Смерть обнуляет силу удара, здоровье и не позволяет лечиться.

Сымитируй бой, вызвав несколько раз методы урона и лечения. В конце игрок должен умереть.

 */

fun main() {

    val fighter = Player(
        "Slayer",
        100,
        15,
    )

    fighter.takingDamage(25)
    fighter.healing(15)
    fighter.takingDamage(60)
    fighter.healing(15)
    fighter.takingDamage(50)
    fighter.healing(15)

}

class Player(
    val name: String,
    private var health: Byte = 0,
    var hitPower: Byte,
) {

    var deathFlag = false

    fun takingDamage(damage: Byte) {
        health = (health - damage).toByte()

        if (health > 0) println("Получено урона: $damage ед. Осталось $health единиц здоровья.")
        else {
            println("Получен смертельный удар! ($damage ед.)")
            death()
        }
    }

    private fun death() {
        deathFlag = true
        health = 0
        hitPower = 0
        println("Потрачено")
    }

    fun healing(heal: Byte) {
        if (!deathFlag) {
            health = (health + heal).toByte()
            println("Получено лечение: $heal ед. Осталось $health единиц здоровья.")
        } else println("Герой умер, лечение нвозможно!")
    }
}