package lesson_11

/*

Задача 3 к Уроку 11

Нужно описать сущности для упрощенной версии приложения социальной сети, в которой общаются только голосом.

Функционал одного из модулей будет такой.
Есть лента, в которой отображаются “комнаты” для общения по интересам. В карточке “комнаты” отображается:
 – обложка
 – название
 – список участников, которые отображаются в виде аватарок. При долгом нажатии на аватар подсветится его никнейм.
 Рядом с аватаркой отображается текстовый бейдж с одним из возможных статусов говорящего:
 “разговаривает”, “микрофон выключен”, “пользователь заглушен”.

После проектирования создай список объектов карточек с несколькими “комнатами” с произвольными данными.


 */

fun main() {

    val rockUsers = listOf(
        User("Аватар-Гитара.jpg", "Рок-участник №1", "Включить микрофон"),
        User("Аватар-Барабаны.jpg", "Рок-участник №2", "Выключить микрофон")
    )

    val classicalUsers = listOf(
        User("Аватар-Скрипка.jpg", "Классик-участник №1", "Заглушить"),
        User("Аватар-Фортепиано.jpg", "Классик-участник №2", "Включить микрофон")
    )

    val rockMusicRoom = Room(
        "Рок-обложка комнаты",
        "Название комнаты Рокеры",
        rockUsers
    )

    val classicalMusicRoom = Room(
        "Классическая обложка комнаты",
        "Название комнаты Классика",
        classicalUsers
    )

}

class Room(
    cover: String,
    name: String,
    users: List<User>,
)

class User(
    avatarParameter: String,
    nameParameter: String,
    userVoiceStatus: String,
) {

    private val name = nameParameter
    private var voiceStatus = userVoiceStatus
    private var longTapActivated = "Отображение имени отключено"

    fun avatarLongTap(tap: Boolean = false): String {
        if (tap) longTapActivated = "Отображение имени включено"
        return longTapActivated
    }

    fun userVoiceStatus(getStatus: String): String {

        when (getStatus) {
            "Включить микрофон" -> voiceStatus = "разговаривает"
            "Выключить микрофон" -> voiceStatus = "микрофон выключен"
            "Заглушить" -> voiceStatus = "пользователь заглушен"
        }
        return voiceStatus


    }

}

/*

fun main() {

    val RockUserOne = UserRockRoom()

}

abstract class Room {

    abstract val roomCover: String
    abstract val roomName: String
    abstract val usersList: List<String>
    fun voiceStatus(status: String): String {
        when(status) {
            "Включить микрофон" -> return "разговаривает"
            "Отключить микрофон" -> return "микрофон выключен"
            "Заглушить" -> return "пользователь заглушен"
        }
        return status
    }
}

abstract class RockMusicRoom: Room() {

    override val roomCover = "Рок-обложка.jpg"
    override val roomName = "Группа рок-музыки"

}

abstract class ClassicalMusicRoom: Room() {

    override val roomCover = "Пианино.jpg"
    override val roomName = "Классическая музыка"

}

class UserRockRoom(name: String, ): RockMusicRoom() {

    val userAvatar = ""
    private val userName = ""

    fun userIconLongTap(tap: Boolean): String {

        if(tap) return userName
        return userName

    }
 }

abstract class UserClassicalRoom: ClassicalMusicRoom() {

    val userAvatar = ""
    private val userName = ""

    fun userIconLongTap(tap: Boolean): String {

        if(tap) return userName
        return userName

    }
}
*/

