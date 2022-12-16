data class MyFirstEx(var name: String, var id : Int)
{

}
fun main()
{
    var a1 = MyFirstEx("ABC",101)
    var a2 = MyFirstEx("ABC",101)
    if (a1==a2)
    {
        println("equal")
    }
    else
    {
        println("not equal")
    }
    var a3 = a1.copy()
    println(a3)
}