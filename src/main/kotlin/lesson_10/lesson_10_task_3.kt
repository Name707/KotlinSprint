package lesson_10

/*

Задача 3 к Уроку 10

Напиши программу, которая генерирует пароли.
Пароль должен состоять из чередующихся цифр и специальных символов. Например, #5%6”2.

 – пользователь сам задает длину пароля;
 – для генерации пароля должна быть отдельная функция,
 принимающая целочисленное значение длины пароля и возвращающая готовый пароль;
 – пароль должен состоять из цифр от 0 до 9 и специальных символов:
 " # $ % & ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ `   ~ (всего 31 символ).

 */

fun main() {

    println("Введите длину пароля:")
    val passLength = passGenerator(readln().toInt())
    println(passLength)

}
fun passGenerator(length: Int): String {

    val newPass = mutableListOf<String>()
    val symbols = ("\" # \$ % & ' ( ) * + , - . / : ; < = > ? @ [ \\ ] ^ _ ` ~").split(" ")
    for (item in 1..length) {
        if (item % 2 == 0) newPass.add((0..9).random().toString())
        else newPass.add((symbols).random())

    }
    println("Ваш новый пароль:")
    return newPass.joinToString("")
}



//    Реализация с использованием .toRegex()
/*fun main() {

    println("Введите длину пароля:")
    val passLength = passGenerator(readln().toInt())
    println(passLength)

}

fun passGenerator(length: Int): String {

    val newPass = mutableListOf<String>()
    val symbols = ('\"')..('~')
    val convertingSymbols = symbols.joinToString().replace("""[A-Za-z0-9-\s-,]""".toRegex(), "")

    for (item in 1..length) {
        if (item % 2 == 0) newPass.add((0..9).random().toString())
        else newPass.add((convertingSymbols).random().toString())
    }
    println("Ваш новый пароль:")
    return newPass.joinToString("")
}*/
