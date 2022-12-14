fun main()
{
    val year = 2014
    var leap= false
    if (year %4 == 0)
    {
        if(year % 100 == 0 )
        {
            leap = year % 400 == 0

        }
        else
        {
            leap = true
        }

    }
    else
    {
        leap = false
    }
    println(if (leap) "$year is leap year" else "$year is not leap year" )

}