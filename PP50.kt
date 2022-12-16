class MyFirstClass
{
    fun pass(marks:Int,name:String) : Boolean
    {
        return marks > 40

    }
}
  fun MyFirstClass.Schloper(marks: Int,name: String) : Boolean
{
    return marks > 90
}
fun main()
{
    var my = MyFirstClass()
    println("pass status:"+my.pass(41,"abc"))
    println("scholership status:"+my.Schloper(52,"xyz"))
}