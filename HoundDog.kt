import Dogs.*
class HoundDog( var poroda: String, empName: String,  var rost: Double,empCharacter: String, empOkras: String) : Dog(empName,empCharacter, empOkras){

    private var weight: Double = 10.0

    public fun Getweight(): Double{
        return weight
    }
    public fun Getrost(): Double{
        return rost
    }
    public fun Setweight(weight:Double){
        try {

        if (weight<0){
            println(" Вес не может быть отрицательным!")
            var weight = readLine()!!.toDouble()
        }
        else {
            this.weight = weight
        }
        }
        catch (e:Exception)
        {
            println("Неверный формат")
            this.weight = weight
        }
    }

    override fun shows_character() {
        println("$name is $character")
    }
    override fun sleep() {
        println("$name Спит на кровати")
    }

    override fun GetInfo() {
        println("Кличка собаки: $name, Порода : $poroda, Окрас: $okras")
        println("Характер собаки: $character")
        println("Вес собаки $weight")
        println("Рост по холке: $rost")
    }

}