sealed class A
{
    class B : A()
    object C : A()

}
fun main()
{
    val x : A =A.B()
    val output = when(x)
    {
        is A.B->"B class"
        is A.C->"object"
    }
    println(output)
}