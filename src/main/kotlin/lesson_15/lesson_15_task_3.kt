package lesson_15

/*

Задача 3 к Уроку 15

На форуме есть два вида пользователей – обычные пользователи и администраторы.
Пользователи могут читать форум и писать сообщения.
Администраторы могут ещё и удалять сообщения и пользователей.
Напиши классы пользователей и администраторов, используя абстрактный класс.
У абстрактного класса должны быть соответствующие общие поля и методы.
Действия на форуме отобрази сообщениями в консоль.

 */

fun main() {

    val user = OrdinaryUser("Виктор", "Вопрос не по теме")
    val administrator = AdministratorUser("Name707", "Вопросы не по теме запрещены.", user.name)

    user.readForum()
    user.publishMessage()

    administrator.readForum()
    administrator.deleteMessagesTool()
    administrator.deleteUsersTool()

}

abstract class User(
    val name: String,
    val message: String,
) {

    abstract fun readForum()

    abstract fun publishMessage()
}

class OrdinaryUser(
    name: String,
    message: String,
) : User(name, message) {

    override fun readForum() {
        println("Пользователь $name читает форум...")
    }

    override fun publishMessage() {
        println("Пользователь $name пишет:\n\"$message\"")
    }
}


class AdministratorUser(
    name: String,
    message: String,
    val targetUserName: String,
) : User(name, message) {

    override fun readForum() {
        println("Администратор $name читает форум...")
    }

    override fun publishMessage() {
        println("Администратор $name пишет:\n\"$message\"")
    }

    fun deleteMessagesTool() {
        println("Администратор $name удаляет сообщение пользователя $targetUserName")
    }

    fun deleteUsersTool() {
        println("Администратор $name удаляет пользователя $targetUserName")
    }

}