import java.io.FileOutputStream

fun main()
{
    var s:String="Welcome"
    var fout = FileOutputStream("D:// abc.txt")
    fout.write(s.toByteArray())
    println("sucess")
}