class Car {
    var brand = ""
    var model = ""
    var year = 0
}

fun main(){
//    create a c1 object of the Car class
    val c1 = Car()

//    Access the properties and add some values to it
    c1.brand = "Ford"
    c1.model = "Mustang"
    c1.year = 1969

    val c2 = Car()
    c2.brand = "BMW"
    c2.model = "X5"
    c2.year = 1999

    println(c1.brand)
    println(c1.model)
    println(c1.year)

    println(c2.brand)
}