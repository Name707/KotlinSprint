package lesson_1

/*
Задача 2 к Уроку 1

Скопируй решение из задачи 1 в новый файл с задачей 2.
Теперь необходимо дописать реализацию программы для новых целей.
Имитируем логи с сервера.

 – Для начала выведи в консоль значения всех объявленных ранее переменных;
 – Далее нужно сделать так, чтобы программа хранила количество работников данного интернет-магазина (2000).
 Подбери подходящее наименование переменной, присвой ей значение и распечатай;
 – Далее представим, что один работник уволился. Закомментируй предыдущий код с распечаткой количества работников,
 присвой новое значение количества работников этой переменной и распечатай в консоль.

Оценивается не только правильная последовательность действий, но и грамотная организация кода (порядок объявления, отступы и так далее).
 */

fun main() {

    var keyboardOrders: Int = 15
    var keyboardBuyerFeedback: String = "Заказ получен, спасибо"

    var mousepadOrders: Int = 10
    var mousepadBuyerFeedback: String = "Спасибо"

    var mouseOrders: Int = 17
    var mouseBuyerFeedback: String = "Все пришло, благодарю"

    var patchingCordOrders: Int = 6
    var patchingCordFeedback: String = "Отлично!"

    var motherboardOrders: Int = 9
    var motherboardFeedback: String = "Заказ прибыл быстро"

    var monitorOrders: Int = 11
    var monitorFeedback: String = "У одного битые пиксели!!!"

    var officeChairOrders: Int = 1
    var officeChairFeedback: String = "СТУЛ ПРИЕХАЛ СПАСИБО. В ДЕЛЕ НЕ ПРОБОВАЛ НО СТАВЛЮ 5 ЗВЕЗД!!!11"

    var batteryThreeAOrders: Int = 6
    var batteryThreeAFeedback: String = "Заряд держат отлично"

    println("""keyboardOrders: $keyboardOrders, keyboardBuyerFeedback: $keyboardBuyerFeedback
        |mousepadOrders: $mousepadOrders, mousepadBuyerFeedback: $mousepadBuyerFeedback
        |mouseOrders: $mouseOrders, mouseBuyerFeedback: $mouseBuyerFeedback
        |patchingCordOrders: $patchingCordOrders, patchingCordFeedback: $patchingCordFeedback
        |motherboardOrders: $motherboardOrders, motherboardFeedback:$motherboardFeedback
        |monitorOrders: $monitorOrders, monitorFeedback: $monitorFeedback
        |officeChairOrders: $officeChairOrders, officeChairFeedback: $officeChairFeedback
        |batteryThreeAOrders: $batteryThreeAOrders, batteryThreeAFeedback: $batteryThreeAFeedback""".trimMargin())

    var numberOfEmployees: Int = 2000
//    println("Employees: $numberOfEmployees")
    numberOfEmployees -= 1
    println("Employees: $numberOfEmployees")
}