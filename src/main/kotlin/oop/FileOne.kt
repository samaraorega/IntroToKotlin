package oop

fun main(args: Array<String>) {
    println("Welcome to object oriented programming")
    var firstcar = Car("Volkswagen", "golf", "KDL908L")
    var secondcar = Car("Mercedes", "c200", "KCF438Z")
    println(secondcar.model)

    var firstFruit = Fruit("Guava", "Green", 35.00)
    var secondFruit = Fruit("Mango", "Yellow", 40.00)
    println(firstFruit.price)

    var thirdFruit = firstFruit.copy()
    println(thirdFruit.name)

    var firstPhone = Phone("iPhone", "ios", "typeC")
    var secondPhone = Phone("Samsung", "android", "typeB")
    firstPhone.call("0770678266")

    var firstStudent = Student("K", "K@gmail.com", "k123")
    firstStudent.register()
    firstStudent.login()
    firstStudent.logout()

    var firstTeacher = Teacher("King", "King@gmail.com", "king123")
    firstTeacher.register()
    firstTeacher.login()
    firstTeacher.logout()
    firstTeacher.checkAttendance()
    firstTeacher.submitResults()

    var firstHod = Hod("Wama", "Wama@gmail.com", "wama123")
    firstHod.register()
    firstHod.login()
    firstHod.logout()
    firstHod.checkAttendance()
    firstHod.submitResults()
    firstHod.suspendTeacher()
    firstHod.submitResults()

    firstStudent.setidNumber("13785424")
    println(firstStudent.getidNumber())

    var maths = Maths()
    maths.grading()
    maths.standardizeResults()

    var history = History()
    history.grading()
    history.standardizeResults()
}