package lesson_3

/*
Задача 5* к Уроку 3

Продолжаем работать над приложением “Шахматы”.
Напиши программу для сервера, которая примет строку, отправленную игроком
(считаем эти данные уже известными и объявляем строку с данными: “D2-D4;0”.

Необходимо будет сделать обратное. Распарсить строку – разбить ее на 3 составляющих:
откуда, куда и номер хода, присвоить соответствующим переменным и распечатать по отдельности.
 */

fun main() {

    val serverData: String = "D2:D4;0"
    val parsing: List<String> = serverData.split(":", ";")

    var moveStart: String = parsing[0]
    var moveEnd: String = parsing[1]
    var moveNumber: String = parsing[2]

    println("""Starting position: $moveStart
        |End position: $moveEnd
        |Move number: $moveNumber
    """.trimMargin())

}