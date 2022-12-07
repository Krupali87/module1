class Tops2
{
    constructor(id:Int,name:String)
    {
        println("your id is $id")
        println("your name is $name")
    }
    constructor(id: Int, name: String,city:String)
    {
        println("your id is $id")
        println("your name is $name")
        println("your name is $city")
    }
}
fun main()
{
    var t1= Tops2(101,"abc")
    var t2 = Tops2(102,"xyz","rajkot")
}