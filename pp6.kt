interface Print
{
    fun print()
    {
            println("printing")
    }
}
interface  Show
{
    fun show()
    {
        println("showing")
    }
}
class Multiple : Print,Show
{

}
fun main()
{
        var m1 = Multiple()
        m1.print()
        m1.show()
}