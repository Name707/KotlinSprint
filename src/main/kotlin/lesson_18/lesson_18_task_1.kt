package lesson_18

/*

Задача 1 к Уроку 18

CRM (система управления взаимоотношениями с клиентами) обрабатывает заказы в интернет-магазине.
Заказ содержит информацию: номер заказа и товары.
Если товар один, он хранится в виде строки, если несколько – в виде списка строк.

По запросу нужно печатать в консоль сообщение «Заказан товар: [название_товара]» или
«Заказаны следующие товары: [название_товара], … [название_товара]».
Создай 2 объекта заказа и вызови у них метод вывода информации и заказе. Реши задачу, используя полиморфизм.

 */

fun main() {

    val firstOrder = Order()
    firstOrder.addOrder("R6541321", "Наушники")
    firstOrder.getOrderInfo()

    val secondOrder = Order()
    secondOrder.addOrder("R9849456156", listOf("Телефон", "Телевизор", "Помидор"))
    secondOrder.getOrderInfo()

}

class Order {

    lateinit var orderNumber: String
    lateinit var orderGoods: Any

    fun addOrder(
        getOrderNumber: String,
        getGoods: String,                      //String
    ) {
        orderNumber = getOrderNumber
        orderGoods = getGoods
        println("Заказ №$orderNumber создан")
    }

    fun addOrder(
        getOrderNumber: String,
        getGoods: List<String>,                //List
    ) {
        orderNumber = getOrderNumber
        orderGoods = getGoods
        println("Заказ №$orderNumber создан")
    }

    fun getOrderInfo() {
        if (orderGoods is String) println("Заказан товар: [$orderGoods]")
        else println("Заказаны следующие товары: $orderGoods")
    }

}