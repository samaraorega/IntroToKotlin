package oop

fun main(args: Array<String>) {
    println("Welcome to object oriented programming")
    var firstcar = Car("Volkswagen","golf","KDL908L")
    var secondcar = Car("Mercedes","c200","KCF438Z")
    println(secondcar.model)

    var firstFruit = Fruit("Guava","Green",35.00)
    var secondFruit = Fruit("Mango","Yellow",40.00)
    println(firstFruit.price)

    var firstPhone = Phone("iPhone", "ios", "typeC")
    var secondPhone = Phone("Samsung", "android", "typeB")
    firstPhone.call("0770678266")
}