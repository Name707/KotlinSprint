package lesson_11

/*

Задача 4 к Уроку 11

Создай сущность Contact на основании скриншота из телефонной книги и определи поля и методы для экрана.
Для свойств, описывающих иконки, использовать строки с релевантными названиями файлов.
В блоке с контактами в нижней части скриншота – прикрепленные контакты близких людей.
После проектирования создай объект класса Contact с данными из скриншота.

 */

fun main() {

    val emptyContact = Contact(
        "mouse.jpg",
        "First Name",
        "Second Name",
        "mail@mail.ru",
        89999994242,
        89999994242,
        RelativesAndFriends("жена", "userName"),
        RelativesAndFriends("подруга", "userName"),
        RelativesAndFriends("подруга", "userName"),
    )

}

class Contact(
    avatar: String,
    val firstName: String,
    val secondName: String,
    val iCloud: String,
    val mobilePhoneNumber: Long,
    val homePhoneNumber: Long,
    val relativesAndFriendsFirst: RelativesAndFriends,
    val relativesAndFriendsSecond: RelativesAndFriends,
    val relativesAndFriendsThird: RelativesAndFriends,
) {

    fun messageToContactButton(
        buttonMessageIcon: String = "Сообщение.jpg",
        buttonMessageName: String = "написать",
        onClick: Boolean = false,
    ): String {
        if (onClick) println("Введите сообщение")
        val message = readln()
        return message
    }

    fun callToContactButton(
        buttonCallIcon: String = "Телефонная_трубка.jpg",
        buttonCallName: String = "вызов",
        onClick: Boolean = false,
    ) {
        if (onClick) println("Звонок $firstName $secondName...")
    }

    fun videoCallToContactButton(
        buttonCallIcon: String = "Видеокамера",
        buttonCallName: String = "видео",
        onClick: Boolean = false,
    ) {
        if (onClick) println("Видеозвонок $firstName $secondName...")
    }

    fun emailToContactButton(
        buttonMessageIcon: String = "Конверт.jpg",
        buttonMessageName: String = "почта",
        onClick: Boolean = false,
    ): String {
        if (onClick) println("Электронное сообщение $iCloud:")
        val message = readln()
        return message
    }

    fun faceTimeButtons(
        buttonFaceTimeName: String,
        faceTimeVideoIcon: String = "Видеокамера_facetime.jpg",
        faceTimeCallIcon: String = "Телефонная трубка.jpg",
        onClickCamera: Boolean = false,
        onClickPhone: Boolean = false,
        networkDataTransmission: Boolean = false,
        wifiDataTransmission: Boolean = false,

        ): String {
        var action = ""
        if (onClickCamera && (networkDataTransmission || wifiDataTransmission)) action =
            "Видеозвонок $firstName $secondName:"
        if (onClickPhone && (networkDataTransmission || wifiDataTransmission)) action = "Звонок $firstName $secondName:"
        return action
    }
}

class RelativesAndFriends
    (
    userStatus: String,
    userName: String,
)
