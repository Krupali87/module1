import java.lang.Integer.parseInt

fun main()
{
    var a = IntArray(5)
    for (i in 0..4)
    {
        println("enter the choice $i")
        val data = readLine()
        a[i]=parseInt(data)
    }
    for (i in 0..4 )
    {
        a[i]=a[i]
        println(a[i])
    }
}