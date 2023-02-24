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
    private var name: String,
    private var files: Int,
    var hiddenFlag: Boolean,
) {

    val folderName: String
        get() {

            if (hiddenFlag) {
                name = "Скрытая папка"
            }
            return name

        }

    val folderFiles: Int
        get() {

            if (hiddenFlag) {
                files = 0
            }
            return files

        }
}
