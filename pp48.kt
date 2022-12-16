//1 with para with return
fun add(a:Int,b:Int) : Int
{
    return a+b
}
//2 with return without para
fun add1() : Int
{
    var a = 14
    var b = 16
    return a+b
}
//3 with para without return
fun add2(a:Int,b:Int)
{
    var c = a+b
    println(c)

}
//4 without para without return
fun add3()
{
    var a = 4
    var b = 6
    var c = a+b
    println(c)
}
fun main()
{
    println(add(5,7))
    println((add1()))
    add2(41,63)
    add3()
}