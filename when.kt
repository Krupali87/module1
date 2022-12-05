fun main(){

    println("enter the choice")
    val num = readLine()!!.toInt() // null safety
    when(num)
    {
        1 ->
        {
            println("food")
        }
        2 ->
        {
            println(" house")
        }
        3 ->
        {
            println("beach")
        }

    }
}