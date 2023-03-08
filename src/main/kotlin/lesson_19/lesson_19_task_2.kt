package lesson_19

/*

Задача 2 к Уроку 19
В интернет-магазине товары делятся на несколько категорий: одежда, канцелярские товары и разное.
– создай enum класс с категориями;
– создай метод, который примет тип категории и вернет текстовое название категории для пользователя;
– создай класс, описывающий товар (с полями название, id, категория), в классе должен быть метод,
который выводит инфо о товаре. Вызови его для нескольких созданных товаров;
– для вывода информации о товаре, для категории используй метод определения категории.

 */

fun main() {

    val productOne = Product("Рубашка", 1, Category.CLOTH)
    productOne.getProductInfo()

    val productTwo = Product("Циркуль", 2, Category.STATIONERY)
    productTwo.getProductInfo()

    val productThree = Product("Новогодняя маска", 3, Category.OTHER)
    productThree.getProductInfo()

}

enum class Category(val id: Int) {
    CLOTH(1),
    STATIONERY(2),
    OTHER(3),
}

class Product(
    private val productName: String,
    private val id: Int,
    private val category: Category,
) {

    fun getProductInfo() {
        when (id) {
            Category.CLOTH.id -> println("Товар: $productName; id: ${category.id}; Категория: Одежда")
            Category.STATIONERY.id -> println("Товар: $productName; id: ${category.id}; Категория: Канцелярсике товары")
            Category.OTHER.id -> println("Товар: $productName; id: ${category.id}; Категория: Прочее")
        }
    }

}

