package lesson_15

/*

Задача 4 к Уроку 15

На сайте музыкального магазина есть товары двух категорий: инструменты и комплектующие к ним.
Для инструментов есть возможность найти соответствующие комплектующие.
У всех товаров есть название и количество единиц на складе. Напиши классы для категорий товаров.
В качестве поиска – отобрази сообщение «Выполняется поиск». Метод поиска реализуй через интерфейс.

 */

fun main() {

    val hammer = MusicalInstrument("Гитара", 56)
    hammer.searching()

    val hammerHandle = Accessory("Струна", 1707)

}

interface Search {
    fun searching() {

        println("«Выполняется поиск»")

    }
}

abstract class Product(
    productName: String,
    quantityStock: Int,
)

class MusicalInstrument(
    productName: String,
    quantityStock: Int,
) : Product(productName, quantityStock), Search

class Accessory(
    productName: String,
    quantityStock: Int,
) : Product(productName, quantityStock)