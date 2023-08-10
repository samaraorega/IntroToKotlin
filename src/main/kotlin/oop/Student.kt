package oop

open class Student(open var name:String, open var email:String, open var password:String) {

    private var gender:String =""
    fun setGender(gender:String){
        this.gender = gender
    }
    fun getGender():String{
        return this.gender
    }
    private var idNumber:String =""
    fun setidNumber(number:String){
        this.idNumber = number
    }
    fun getidNumber():String {
        return this.idNumber
    }
    fun register(){
        println("Yeah,I can register")
    }
    fun login(){
        println("Yeah,I can login")
    }
    fun logout(){
        println("Yeah,I can logout")
    }
}