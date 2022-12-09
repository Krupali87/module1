open class Bank2
{
    open fun rate () : Int
    {
        return 0
    }

}
class Kotak : Bank2()
{
    override fun rate() : Int
    {
        return 7
    }
}
class Icici : Bank2()
{
    override fun rate() : Int
    {
        return 4
    }
}
fun main()
{
    var b = Bank2()
    b = Kotak()
    println(b.rate())
    var c =  Bank2()
    c = Icici()
    println(c.rate())
}