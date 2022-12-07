open class A1
{
    fun a1()
    {
        println("a accessed")
    }
}
open class B1 : A1()
{
    fun b1()
    {
        println("b accessed")
    }
}
class C1 : B1()
    {
            fun c1()
            {
                println("c accessed")
            }
    }
fun main()
{
    var c = C1()
    c.a1()
    c.b1()
    c.c1()
}