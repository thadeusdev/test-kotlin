fun main(){
    // This is a comment
    print("Hello Peter")
    print("I am learning kotlin.")
    print("It is awesome!")
    print(3 + 3)
    print(5)

    /* The code below will print Hello World to the screen and it is amazing */
    println("Hello World")

//    VARIABLES
    val name = "John"
    val birthYear = 1975

    println(name)
    println(birthYear)
    println("Hello $name")

    val pi = 3.14159265259
    println(pi)

    val x = 5
    val y = 6
    println(x + y)

/*    DATA TYPES

    val myNum = 5            // Int
    val myDoubleNum = 5.99   // Double
    val myLetter = "D"       // Char
    val myBoolean = true      //Boolean
    val myText = "Hello"       // String

 */

//    Byte data type can store whole numbers from -128 to 127.
    val myNumByte: Byte = 100
    println(myNumByte)

//    Short data type can store whole numbers from -32768 to 32767:
    val myNumShort: Short = 5000
    println(myNumShort)

//    Int data type can store whole numbers from -2147483648 to 2147483647:
    val myNumInt: Int = -100000
    println(myNumInt)

//    Long data type can store whole numbers from -9223372036854775807 to 9223372036854775807.
    val myNumLong = 15000000000L // Optionally, you can end the value with an "L":
    println(myNumLong)

//    OPERATORS
    val sum1 = 100 + 50
    val sum2 = sum1 + 250
    val sum3 = sum2 + sum2
    println(sum1)
    println(sum2)
    println(sum3)

//    STRINGS
    val greeting = "Hello"
    println(greeting)

    val txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    println(txt[0])
    println(txt[2])
    println("The length of the string is: " + txt.length)
    println(txt.lowercase())

    val txt1 = "Hello World"
    val txt2 = "Hello World"
    println(txt1.compareTo(txt2))

    val word = "Please locate where 'locate' occurs"
    println(word.indexOf("locate"))

    val firstName = "John"
    val lastName = "Doe"
    println("My name is $firstName $lastName")

//    BOOLEANS
   // println(10 == 15)

//    IF ... ELSE
}