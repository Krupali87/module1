//infix
class Detail
{
        fun student( id:Int): Int
        {
            return id
        }
}
infix fun Detail.s1(name: String): String
{
    return name
}
fun main()
{
    var a = Detail()
    println("student id is:"+a.student(101))
    println("student name is:"+a.s1("abc"))
}