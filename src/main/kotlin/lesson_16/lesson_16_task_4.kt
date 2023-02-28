package lesson_16

/*

Задача 4 к Уроку 16

Создать класс, описывающий заказ в интернет-магазине.
В заказе должны быть номер заказа и статус готовности. Номер заказа должен быть недоступен для изменения.

Создай метод, который меняет статус заказа. Поменять статус заказа можно только отправив заявку менеджеру.
Имитируй это действие отдельной функцией.
Она будет принимать новый статус и обращаться к внутреннему методу класса для изменения статуса.

 */

fun main() {

    val order = Order(112233, "Прибыл на склад")

    order.managerRequest()
    order.changeStatus()

}

class Order(
    private val orderNumber: Int,
    private var orderStatus: String,
) {

    private var permissionToChangeStatus = false

    fun managerRequest() {
        permissionToChangeStatus = true
        println("Заявка менеджеру отправлена.")
    }

    fun changeStatus() {
        if (permissionToChangeStatus) orderStatus = "Готово к выдаче"
        println(orderStatus)
    }
}