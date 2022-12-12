fun main()
{
   println("enter the first subject markes")
    var sub1 = readLine()!!.toInt()
    println("enter the second subject markes")
    var sub2 = readLine()!!.toInt()
    println("enter the third subject markes")
    var sub3 = readLine()!!.toInt()
    println("enter the forth subject markes")
    var sub4 = readLine()!!.toInt()
    println("enter the fifth subject markes")
    var sub5 = readLine()!!.toInt()
    var sum = sub1+sub2+sub3+sub4+sub5
    var a = (sum*100)/500
    println("the percentage is $sum")
}
