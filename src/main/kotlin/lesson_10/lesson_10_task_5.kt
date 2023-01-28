package lesson_10

/*

Задача 5 к Уроку 10

Собери в одно целое регистрацию пользователя, проверку логина (минимум 4 символа),
генерацию пароля для него и авторизацию по коду из смс – программа должна “высылать” код из четырех цифр
(случайное число от 1000 до 9999). Пользователь будет вводить этот код. Если код введён неверно, программа вышлет новый.

Алгоритм действий:
1. Регистрация
 – пользователь придумывает логин (длина должны быть более 4 символов);
 – программа генерирует пароль и отображает его пользователю;

2. Авторизация
 – программа предлагает авторизоваться, пользователь вводит логин и пароль;
 – если данные неверны, отображается ошибка и логин и пароль запрашиваются заново;
 – если данные верны, “высылается” сгенерированный код из 4 цифр и запрашивается у пользователя;
 – если код неверен – высылается новый, если верен – появляется сообщение об успешной авторизации.

Действия в программе должны быть распределены по соответствующим методам без дублирования кода.

 */

fun main() {

    println("Регистрация. Придумайте логин от 4 символов:")
    val userLogin = registration(readln())
    println("Ваш логин:$userLogin")

    val userPass = passwordGenerator()
    println("Ваш пароль:$userPass")

    println("Авторизация. Введите логин и пароль:")
    val authoriz = authorization(userLogin, userPass)
    println(authoriz)

    println("На Ваш телефон отправлен SMS-код для входа.")
    val getSms = smsSender()
    println("Полученный код $getSms")

    println("Введите полученный код из СМС:")
    val codeCheck = smsChecker(getSms)
    println(codeCheck)


}

fun registration(login: String?): String {

    var validLogin: String

    return if (login!!.length >= 4) login
    else {
        do {
            println("Логин недостаточно длинный. Придумайте логин:")
            validLogin = readln()
        } while (validLogin.length < 4)
        validLogin
    }

}

fun passwordGenerator(): String {
    val newPass = mutableListOf<String>()
    val passLength = 10
    val symbols = ('\"')..('~')
    val convertingSymbols = symbols.joinToString().replace("""[A-Za-z0-9-\s-,]""".toRegex(), "")
    for (item in 1..passLength) {
        if (item % 2 == 0) newPass.add((0..9).random().toString())
        else newPass.add((convertingSymbols).random().toString())
    }

    return newPass.joinToString("")
}

fun authorization(trueLogin: String, truePass: String): String {

    val inputLogin = readln()
    val inputPass = readln()

    if (inputLogin == trueLogin && inputPass == truePass) return "Вход..."
    do {
        println("Неверный логин или пароль. Введите логин и пароль:")
        val nextTryLogin = readln()
        val nextTryPass = readln()
    } while (nextTryLogin != trueLogin || nextTryPass != truePass)
    return "Вход..."
}

fun smsSender(): Int {

    return (1000..9999).random()

}

fun smsChecker(trueCode: Int): String {

    val codeChecker = readln().toInt()
    if (codeChecker == trueCode) return "Авторизация прошла успешно!"
    else {
        do {
            println("Введен неправильный код из СМС. Отправлен новый.")
            val getNewCode = smsSender()

            println(
                """Новый СМС код:$getNewCode
                |Введите СМС код:
            """.trimMargin()
            )
            val userInputCode = readln().toInt()
        } while (userInputCode != getNewCode)
        return "Авторизация прошла успешно!"
    }
}
