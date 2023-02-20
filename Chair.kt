import Products.*
class Chair( empName: String  ,empVidtov: String, empCondition: String, var edizm: String, var kolvo: String) : Product(empName,empVidtov, empCondition){

    private var price: Double = 10.0
    public fun Getprice(): Double{
        return price
    }

    public fun Setprice(price:Double){
        try {
        if (price<0){
            println(" Цена не может быть отрицательной!")
        }
        else {
            this.price = price
        }
        }
        catch (e:Exception)
        {
            println("Неверный формат")
            this.price = price
        }
    }

    override fun sklad() {
        println("$name есть на складе ")
    }
    override fun condition(){
        println ("$name is $condition")
    }

    override fun GetInfo() {
        println("Название товара: $name, Цена: $price, Вид товара: $vidtov")
        println("Единицы измерения: $edizm")
        println("Количество товара $kolvo")
    }

}