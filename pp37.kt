fun main()
{
    var num1 = 87
    var num2 = 54
    var num3 = 65
    if (num1>num2)
    {
        if (num1>num3)
        {
            println("max number is $num1")
        }
        else
        {
            println("max number is $num3")
        }
    }
    else if (num2>num3)
    {
        println("max number is $num2")
    }
    else
    {
        println("max number is $num3")
    }

}