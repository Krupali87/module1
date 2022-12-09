class Student(var id:Int, var name:String) {
    companion object {
        var college: String = "asiatic"
    }

    fun detail() {
        println("your is id $id")
        println("your name is $name")
        println("your college is $college")
    }
}
fun main() {
    var s1 = Student(101, "abc")
    var s2 = Student(101, "xyz")
    s1.detail()
    s2.detail()
}