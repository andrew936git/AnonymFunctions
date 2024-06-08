import jdk.jfr.Event
import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//1
    println("Введите имя")
    val name = readln()
    println("И наступающий год")
    val newYear = readln().toInt()
    val congratulation = fun (name: String, newYear: Int) = "$name! Поздравляю тебя с новым, $newYear годом!!!"
    val result = congratulation(name, newYear)
    println(result)
    println("-----------------------------------------------------------")
//2
    val random = Random
    val array: Array<Int> = Array(6){random.nextInt(0, 9)}
    val isEven = fun(num: Int) = num % 2 == 0
    checkArrayElement(array, isEven)
    println("------------------------------------------------------------")
//3
    val firstString = "Hello"
    val secondString = "world!"
    val concatenation = fun (str1: String, str2: String) = "$str1 $str2"
    val resString = concatenation(firstString, secondString)
    println(resString)
}
fun checkArrayElement(array: Array<Int>, isEven:(num:Int)-> Boolean){
    for (i in array){
        print("$i - ${isEven(i)} | ")
    }
}

