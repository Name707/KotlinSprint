package lesson_2

/*
Задача 2 к Уроку 2

В компании работало 50 человек с зарплатой по 30000 рублей.
Затем в компанию устроилось 30 стажеров, которым назначили зарплату в 20000 рублей каждому.
Пишем часть гипотетического софта для бухгалтерии, который будет считать:

– Расходы на выплату зарплаты постоянных сотрудников;
– Общие расходы по ЗП после прихода стажеров;
– Среднюю ЗП одного сотрудника после устройства стажеров.

Каждый пункт посчитать и сохранить в переменную с соответствующим названием.
Все значения необходимо вывести в виде целых чисел.
 */

fun main() {

    val workers: Byte = 50
    val workerSalary: Short = 30000
    val allWorkersSalaries: Int = workers * workerSalary
    println("Workers salaries: $allWorkersSalaries")

    val trainee: Byte = 30
    val traineeSalary: Short = 20000
    val allTraineesSalaries: Int = trainee * traineeSalary

    val allCompanySalaries: Int = allWorkersSalaries + allTraineesSalaries
    println("Company salaries: $allCompanySalaries")

    val averageSalary: Int = allCompanySalaries / (workers + trainee)
    println("Average salary: $averageSalary")

}