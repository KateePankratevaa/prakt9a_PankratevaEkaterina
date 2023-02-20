package Products
open class Product
    (var name: String,  var vidtov: String, var condition: String)
{
    open fun sklad(){
        println ("$name есть на складе ")
    }
    open fun condition (){
        println ("$name is $condition")
    }
    open fun GetInfo(){
        println ("Информация о товаре")
        println("Название товара: $name, Вид товара: $vidtov" )
    }
}