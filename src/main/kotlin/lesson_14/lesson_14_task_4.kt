package lesson_14

/*

Задача 4 к Уроку 14

В компьютерной игре существуют планеты. У некоторых из них есть спутники.
Планеты и спутники могут быть обитаемыми, могут иметь атмосферу, воду, могут быть пригодными для высадки.
Создай родительский класс, описывающий небесные тела, и подклассы, описывающие планеты и спутники.
Затем создай планету с двумя спутниками и выведи в консоль имя планеты и имена всех спутников.

 */

fun main() {

    val planetMars = Planet(
        false,
        true,
        true,
        false,
        "Mars",
        2
    )

    val satellitePhobos = Satellite(
        false,
        false,
        false,
        false,
        "Phobos"
    )

    val satelliteDeimos = Satellite(
        false,
        false,
        false,
        false,
        "Phobos"
    )

    println(planetMars.name)


}

abstract class AstronomicalObject(
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
)

class Planet(
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
    val name: String,
    val satelliteNumber: Byte,
) : AstronomicalObject(habitable, atmosphere, water, suitableForLanding)

class Satellite(
    habitable: Boolean,
    atmosphere: Boolean,
    water: Boolean,
    suitableForLanding: Boolean,
    val name: String,
) : AstronomicalObject(habitable, atmosphere, water, suitableForLanding)

