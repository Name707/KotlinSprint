package lesson_20

/*

Задача 5 к Уроку 20
Программируем робота. Робот умеет говорить и работать с модификаторами речи. Речь реализуется методом say().
Модификатор устанавливается функцией setModifier(), принимающий лямбду.
Робот произносит одну из случайных 5 фраз (придумай фразы самостоятельно).
Реализуй модификатор, инвертирующий слова робота.

 */

fun main() {

    val robot = Robot()
    robot.setModifier { phrase -> phrase.reversed() }
    robot.say()

}

class Robot {

    private val phrases = listOf(
        "Как дела?",
        "Что нового?",
        "Давно не виделись!",
        "Задавайте ваши ответы",
        "Ошибка",
    )

    private lateinit var modifier: (String) -> String

    fun say() {

        val phrase = phrases.random()
        val modifiedPhrase = modifier(phrase)
        println(modifiedPhrase)

    }

    fun setModifier(modifier: (String) -> String) {

        this.modifier = modifier

    }
}