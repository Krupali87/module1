class MyFirstClass2
{
    fun multiply(a:Int,b:Int,action:(Int)-> Unit)
    {
        val multiplication = a * b
        action(multiplication)
    }

}
fun main()
{
    val my = MyFirstClass2()
    val myLambda : (Int) -> Unit={a:Int-> println(a) }//lambda syntax
    my.multiply(5,10,myLambda)
}