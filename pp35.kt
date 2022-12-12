import java.io.FileInputStream
import java.io.ObjectInputStream

class D1
{
    fun data2()
    {
        var in1 = ObjectInputStream(FileInputStream("D:// abc.txt"))

        var t3 :Tops12= in1.readObject() as Tops12
        println("${t3.id} , ${t3.name}")


    }
}
fun main()
{
       var s3 = D1()
        s3.data2()
}