import kotlin.math.max
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //Inbuilt functions
    var greeting = "Hello world"
    println(greeting.uppercase())
    println(greeting.lowercase())
    println(greeting.reversed())
    println(greeting.replace("world", "TS"))

    var number = 10.0
    println(sqrt(number))
    println(Math.pow(number,2.0))

    //User defined functions
    motto()
    mission()
    add()
    addition(10,20)
    avg(10.0, 50.0f, 34)
    println(mean(12, 34.9))
    println(fullName("Samara", "Orega"))

}

fun motto(){
    println("Let's create a motto")
}
fun mission(){
    println("This mission is impossible")
}
fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println("Your answer is $z")
}
fun addition(x:Int, y:Int){
    var z = x + y
    println("Your answer is $z")

}
fun avg(x:Double, y:Float, z:Int){
    var average = (x + y + z) / 3.0
    println("Your average is $average")
}
fun mean(x:Int, y:Double): Double{
    return (x + y) / 2.0

}
//fun fullName(firstName:String, lastName:String):String = "$firstName $lastName"
fun fullName(firstName:String, lastName:String):String{
    var name ="$firstName $lastName"
    return name
}