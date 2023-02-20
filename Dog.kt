package Dogs
open class Dog
    (var name: String, var character : String, var okras: String)
{
        open fun sleep (){
            println ("$name is slepping")
        }
    open fun shows_character (){
        println ("$name is $character")
    }
    open fun GetInfo(){
        println ("Информация о данной собаке")
        println("Кличка животного $name, Окрас: $okras  ")
    }
}

