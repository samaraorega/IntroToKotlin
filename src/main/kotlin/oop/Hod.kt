package oop

class Hod(name:String, email:String, password:String):Teacher(name, email, password) {
    fun suspendTeacher(){
        println("Yeah,I can suspend a teacher")
    }
    fun scheduleMeeting(){
        println("Yeah,I can schedule a meeting")
    }
}