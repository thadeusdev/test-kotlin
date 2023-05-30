fun myFunction(){
    println("I just got executed!")
}

fun myFirst(fname: String){
    println("$fname Doe")
}

fun mySecond(fname: String, age: Int){
    println("$fname is $age")
}

/* Return Values */
fun myThird(x: Int): Int{
    return (x + 5)
}
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
    if (20 > 18){
        println("20 is greater than 18")
    }

    val time = 20
    if (time < 18){
        println("Good day.")
    }else{
        println("Good evening.")
    }

    val clock = 22
    if (clock < 10){
        println("Good morning.")
    }else if (clock < 20){
        println("Good day.")
    }else{
        println("Good evening.")
    }

    val timer = 20
    val greetings = if (timer < 18){
        "Good day."
    }else{
        "Good evening."
    }
    println(greetings)

//    WHEN
    val day = 4
    val result = when (day){
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }
    println(result)

//    WHILE LOOP
    var i = 0
    while (i < 5){
        println(i)
        i++
    }

    /* Do..While Loop - execute once before checking if the condition is true */
    var t = 0
    do {
        println(t)
        t++
    }
    while(t < 5)

//    BREAK & CONTINUE
    /* Break - used to jump out of a loop */
    var a = 0
    while (a < 10){
        println(a)
        a++
        if (a == 4){
            break
        }
    }

    /* Continue */
    var b = 0
    while (b < 10){
        if (b == 4){
            b++
            continue
        }
        println(b)
        b++
    }

//    ARRAYS
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars[0])
    cars[0] = "Opel"
    println(cars[0])

    /* Length/Size */
    println(cars.size)

    /* check is an element exists */
    if ("Volvo" in cars){
        println("It exists!.")
    }else{
        println("It does not exist.")
    }

    /* Loop through an Array */
    for (x in cars){
        println(x)
    }

//    FOR LOOP
    val numbers = arrayOf(1, 5, 10, 15, 20)
    for (x in numbers){
        println(x)
    }

//    RANGES
    /* print the whole alphabet */
    for (chars in 'a'..'x'){
        println(chars)
    }

    for (nums in 5..15){
        if (nums == 10){
            break
        }
        println(nums)
    }

    for (x in 5..15){
        if (x == 10){
            continue
        }
        println(x)
    }

//    FUNCTIONS
    /* function - is a block of code which only runs when it is called. */
    myFunction()
    myFirst("John")
    mySecond("John", 35)

    var resul = myThird(3)
    println(resul)

}