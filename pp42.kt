fun main()
{
    val r = 25
    val a = 14
    val b = 25

    println("Emter")
    val num = readLine()!!.toInt()


    if(num==1)
    {
        val area : Double = Math.PI * r * r
        println("the area of circle is $area")
    }
    if (num==2)
    {
        val area : Double = 1.0/2.0 * a * b
        println("the area of triangle is $area")
    }
    if (num==3)
    {
        val area :Int=a*b
        println("the area of trangle is $area")
    }
}