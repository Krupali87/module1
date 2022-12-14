fun main()
{
    println("enter the choice")
    var a = 10
    var b = 25
    var c = a + b
    var d = a-b
    var e = a*b
    var f = a/b
    var num = readLine()!!.toInt()
    when(num)
    {
        1 ->
            println("the addition is $c")
        2 ->
            println("the substration is $d")
        3 ->
            println("the multiplication is $e")
        4->
            println("the division is $f")

    }
}