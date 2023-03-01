package lesson_17

/*


Задача 3 к Уроку 17

В приложении для хранения облачных файлов есть папки и файлы.
Создай класс папки, который имеет имя, количество файлов и флаг “секретно”.
Если флаг имеет значение true, то при попытке прочитать имя, возвращать строку “скрытая папка” и количество файлов – 0.
В ином случай возвращать ее название и реальное количество файлов.

Создай экземпляр “скрытой” папки. Протестируй попытку чтения ее данных. Используй геттеры.

 */

fun main() {

    val newFolder = Folder(
        "Папка707",
        156,
        true
    )
    println(newFolder.folderName)
    println(newFolder.folderFiles)

}

class Folder(
    private val name: String,
    private val files: Int,
    private val hiddenFlag: Boolean,
) {

    val folderName: String = ""
        get() = if (hiddenFlag) "Скрытая папка" else field

    val folderFiles: Int = 0
        get() = if (hiddenFlag) 0 else field
}

