package lesson_14

/*

Задача 3 к Уроку 14

Создай 2 класса. Первый (родительский) описывает сообщение на форуме.
Нужно хранить текст сообщения и имя автора. Второй (наследующий) класс – для комментариев.

 – нужен метод, имитирующий публикацию поста на форуме. Сообщение должно содержать текст и автора поста;
 – нужен еще один метод для имитации комментария к посту. Сообщение должно содержать текст и автора комментария,
 а также информацию о посте, к которому оставлен комментарий;
 – выведи в консоль пост и комментарий к нему.

 */

fun main() {

    val newPostAuthor = ForumMessage("User707", """Всем привет, на этом месте должно быть содержательное,
        |интересное и оригинальное сообщение...
    """.trimMargin())

    newPostAuthor.publishPost()

    val newCommentAuthor = ForumComment(
        newPostAuthor.authorName,
        newPostAuthor.authorMessage,
        "Гость",
        "Привет, отличный пост."
        )

    newCommentAuthor.publishComment()

}

open class ForumMessage(
    val authorName: String,
    val authorMessage: String,
) {

    fun publishPost() {

        println("""Пост пользователя $authorName: 
            |$authorMessage""".trimMargin())

    }
}

class ForumComment(
    val targetAuthorName: String,
    val targetAuthorMessage: String,
    val commentatorName: String,
    val commentatorMessage: String,
    ) : ForumMessage(commentatorName, commentatorMessage) {

        fun publishComment() {
            println("""
                |
                |$commentatorName: $commentatorMessage
                |ответ на пост:
                |"$targetAuthorName: $targetAuthorMessage"""".trimMargin())
        }

    }