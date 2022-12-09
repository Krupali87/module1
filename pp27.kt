class Abc
{
    fun add(a:Int, b:Int) :Int
    {
        return a+b
    }
    fun add(a:Int,b:Int,c:Int) : Int
    {
        return a*b*c
    }
}
fun main()
{
    var  A1 = Abc()
    println(A1.add(2,8))
    var A2 = Abc()
    println(A1.add(5,8,10))

}