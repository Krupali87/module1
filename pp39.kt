fun main() {
        println("enter the first subject markes")
        var sub1 = readLine()!!.toInt()
        println("enter the second subject markes")
        var sub2 = readLine()!!.toInt()
        println("enter the third subject markes")
        var sub3 = readLine()!!.toInt()
        println("enter the forth subject markes")
        var sub4 = readLine()!!.toInt()
        println("enter the fifth subject markes")
        var sub5 = readLine()!!.toInt()
        var sum = sub1 + sub2 + sub3 + sub4 + sub5
        var a = (sum * 100) / 500
        println("the percentage is $a")
        if(sub1>75)
        {
            println("distiction")
        }
       else if(sub2<=60)
        {
            println("First class")
        }
       else if(sub3<=50)
        {
            println("Second class")
        }
        else if (sub4<=35)
        {
            println("Pass class")
        }
        else
        {
            println("fail")
        }

    }
