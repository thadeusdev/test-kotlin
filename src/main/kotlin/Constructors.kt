/* a constructor - is like a function, and it is defined using two parenthesis () after the class name. */
class CarOne(var brand: String, var model: String, var year: Int)

fun main(){
    val c1 = CarOne("Ford", "Mustang", 1969)
    val c2 = CarOne("BMW", "X5", 1999)
    val c3 = CarOne("Tesla", "Model S", 2020)

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
    println(c3.brand)
}