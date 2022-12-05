fun main(){
     println(" enter the mark")
    var mark = readLine()!!.toInt()
    if ( mark >= 74)
    {
        println("excillent")
    }
    else if (mark>= 54)
    {
        println("very good")
    }
    else if (mark>= 47){
        println("good")
    }
    else
    {
        println("fail")
    }
}