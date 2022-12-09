class Counter
{
    companion object
    {
        var count = 0
    }
    constructor(id:Int,name:String)
    {
        count ++
        println(count)
    }
}
fun main()
{
      var c1 = Counter(101,"abc")
       var c2 = Counter(102,"xyz")
    var c3 = Counter(103,"xyz")
}