package lesson_2

/*
Задача 4 к Уроку 2

В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
который дает +20% к добытым материалам.
Было добыто 7 кристаллической и 11 железной руды без баффа – заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом).
По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасывается.
 */

fun main() {

    val initCrystalOre: Int = 7
    val initIronOre: Int = 11

    var receivedCrystalOre: Int = 15    // Вводим нужные значения заработанных ресурсов к изначальным
    var receivedIronOre: Int = 10

    var buffReceivedCrystalOre: Int = receivedCrystalOre * 20 / 100
    var buffReceivedIronOre: Int = receivedIronOre * 20 / 100

    var buffActivated: Boolean = true

    if (buffActivated) {
        println("""Bonus Crystal Ore: $buffReceivedCrystalOre
            |Bonus Iron Ore: $buffReceivedIronOre
        """.trimMargin())
    }
    else {
        println("""Bonus Crystal Ore: 0
            |Bonus Iron Ore: 0
        """.trimMargin())
    }

/*
    Вариант №2 - Сначала получаем количество заработанных ресурсов,
    затем высчитываем, сколько из них бонусных(если активированы)

    val initCrystalOre: Int = 7
    val initIronOre: Int = 11

    var receivedCrystalOre: Int = 0    // Вводим нужные значения заработанных ресурсов к изначальным
    var receivedIronOre: Int = 0

    var currentCrystalOre: Int = initCrystalOre + receivedCrystalOre
    var currentIronOre: Int = initIronOre + receivedIronOre

    var buffReceivedCrystalOre: Int = 0     // Ресурсы, полученные от баффа
    var buffReceivedIronOre: Int = 0

    var buffActivated: Boolean = true

    if (buffActivated) {
        buffReceivedCrystalOre = receivedCrystalOre * 20 / 100
        buffReceivedIronOre = receivedIronOre * 20 / 100
    }

    println("""All Crystal Ore: $currentCrystalOre (20% bonus: $buffReceivedCrystalOre)
        |All Iron Ore: $currentIronOre (20% bonus: $buffReceivedIronOre)
    """.trimMargin())
*/
}