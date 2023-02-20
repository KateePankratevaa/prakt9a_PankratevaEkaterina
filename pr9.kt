import Dogs.Dog as NewDog
import Products.Product as NewProduct
fun main(){
    var Sam = HoundDog( "Такса", "Сэм",12.4, "Игривый", "Коричневый")
    println("Напишите вес собаки")
    var weight1 = readLine()!!.toDouble()
    Sam.Setweight(weight1)
    Sam.GetInfo()
    Sam.sleep()
    Sam.shows_character()
    var GamingChair = Chair( "Игровое кресло", "Стулья","Новое", "millimeter","5")
    println("Напишите цену товара")
    var price1 = readLine()!!.toDouble()
    GamingChair.Setprice(price1)
    GamingChair.GetInfo()
    GamingChair.sklad()
    GamingChair.condition()
}
