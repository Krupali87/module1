enum class Item
{
    Dress,Pen,Book,Grossary,Box,Imitation,vegitables
}
fun main()
{
    var I1 : Item
    I1 = Item.Imitation
    when(I1)
    {
        Item.Dress-> println("the first item is Dress")
        Item.Pen-> println("the second item is Pen")
        Item.Book-> println("the third item is Book")
        Item.Grossary-> println("the forth item is Grossary")
        Item.Box-> println("the fifth item is Box")
        Item.Imitation-> println("the six item is Imitation")
        Item.vegitables-> println("the seven item is vegitables")

    }
}