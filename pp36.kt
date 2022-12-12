class Sender
{
    fun send(msg:String)
    {
        println("sending $msg")
        Thread.sleep(3000)
        println("$msg sent")
    }
}
class ThreadSend(var sender: Sender, var msg: String) : Thread()
{
    override fun run()
    {
        synchronized(sender)
        {
            sender.send(msg)
        }

    }
}
fun main()
{
    var sender = Sender()
    var t1 = ThreadSend(sender,"hello")
    var t2 = ThreadSend(sender,"hii")
    t1.start()
    t2.start()
}