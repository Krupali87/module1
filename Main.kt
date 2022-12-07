class k1 ()
{
        var name = ""
        var city =  ""

        fun detail()
        {
            println("your name is $name")
            println("your name is $city")
        }

}
fun main() {
             var a1 = k1()
              a1.name = "abc"
              a1.city = "rajkot"
              a1.detail()
              println()

              var a2 = k1()
               a2.name = "xyz"
                a2.city = "gondal"
                a2.detail()


}