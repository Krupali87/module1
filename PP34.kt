import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class s1
{
    fun data()
    {
        var t3 = Tops12(1,"abc")
        var fout = FileOutputStream("D:// abc.txt")
        var out12:ObjectOutputStream = ObjectOutputStream(fout)
        out12.writeObject(t3)
    }
}
fun main()
{
    var s2 = s1()
    s2.data()
}