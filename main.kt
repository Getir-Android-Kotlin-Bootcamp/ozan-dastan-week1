// PAGE-24
// org.example.package // package name standard

// PAGE-26
const val MAX_HEALTH = 100
val USER_NAME_FIELD = "Username"
val mutableCollection: MutableCollection<String> = HashSet()

// PAGE-28
// @Target(AnnotationTarget.PROPERTY)
// annotation class JsonExclude
// PAGE-28
// @file:JvmName("FooBar")
// package foo.bar

fun main() {
    // PAGE-9
    println("PAGE-9")
    print("Ilk print!")
    println("Ilk println!")
    println(55)

    // PAGE-10
    println("PAGE-10")
    println(multiply(5, 2))
    println(multiply2(8, 3))
    printMultiply(10, 8)

    // PAGE-11
    println("PAGE-11")
    val sayi1: Int = 5
    val sayi2 = 10.5
    val sayi3: Int
    sayi3 = 3
    var sayi4 = 8
    sayi4 = 15 // var can be reassigned
    sayi4++
    println("sayi1=$sayi1, sayi2= $sayi2, sayi3=$sayi3, sayi4=$sayi4")

    // PAGE-12
    println("PAGE-12")
    val heavyMetal = HeavyMetal(4, "Black Sabbath")
    println(heavyMetal.bandInfo)
    println("Band's active state is ${heavyMetal.isActive}")

    // PAGE-14
    println("PAGE-14")
    var sayi5 = 5
    val text1 = "sayi5 ($sayi5) has one digit"
    sayi5 = 11
    val text2 = "${text1.replace("has","had")}, but now sayi5 ($sayi5) has two digits"
    println(text2)

    // PAGE-15
    println("PAGE-15")
    println(numberComparator(7, 10))
    println(numberComparator2(12, 8))

    // PAGE-16
    println("PAGE-16")
    val bandList = listOf("Metallica", "Deep Purple", "Scorpions")
    for (band in bandList) {
        println("Band name is $band")
    }
    for (index in bandList.indices) {
        println("Band at $index is ${bandList[index]}")
    }

    // PAGE-17
    println("PAGE-17")
    val filmList = listOf("Poor Things", "Oppenheimer", "Killers of the flower moon")
    var loopCounter = 0
    while (loopCounter < filmList.size) {
        println(filmList[loopCounter])
        loopCounter++
    }

    // PAGE-18
    println("PAGE-18")
    println(objectToColor(5))

    // PAGE-19
    println("PAGE-19")
    val sayi6 = 15
    val sayi7 = 21
    if (sayi6 in 1..sayi7 - 5) { // check if val in range
        println("sayi6 fits in range")
    }
    val charList = listOf("x", "y", "z")
    if (-5 !in 0..charList.lastIndex) {
        println("-5 is out of range between 0 and ${charList.size}")
    }
    if (charList.size !in charList.indices) {
        println("${charList.size} out of indices range ${charList.indices}")
    }
    for (i in 0..charList.size) {
        print(i)
    }
    println()
    for (i in 0..charList.size * 2 step 3) {
        print(i)
    }
    println()
    for (i in charList.size * 3 downTo 0) {
        print(i)
    }

    // PAGE-20
    println("PAGE-20")
    val nameList = listOf("Ozan", "Mert", "Metin", "Ahmet")
    val filteredList = nameList.filter { it.endsWith("t") }.toList()
    val sortedList = nameList.sorted()
    val mappedList = nameList.map { it.lowercase() }
    println(filteredList)
    println(sortedList)
    println(mappedList)
    nameList.forEach { println(it) }

    // PAGE-21
    println("PAGE-21")
    val text3: String? = null // nullable val
    if (text3 == null) {
        println("text3 is null")
    }

    // PAGE-22
    println("PAGE-22")
    println(checkString(55))
    println(checkString("patikadev"))

    // PAGE-37
    println("PAGE-37")
    val user = User(1, "Ozan", "1234", "mail")
    println(user)

    // PAGE-38
    println("PAGE-38")
    auth() //default function parameters

    // PAGE-39
    println("PAGE-39")
    
}

// PAGE-10
fun multiply(x: Int, y: Int): Int { // classic function return
    return x * y
}

fun multiply2(x: Int, y: Int) = x * y // alternate function return

fun printMultiply(x: Int, y: Int): Unit { // void function
    println("Multiplying $x and $y is ${x*y}")
}

// PAGE-12-13
open class Metal() {
    val isActive = true
}
// open keyword for the inheritance
class HeavyMetal(val memberSize: Int, val bandName: String) : Metal() {
    val bandInfo = "Band has $memberSize members and the band name is $bandName"
}

// PAGE-15
fun numberComparator(x: Int, y: Int): String {
    if (x > y) {
        return "$x is bigger than $y"
    } else {
        return "$y is bigger than $x"
    }
}
// alternate function expression
fun numberComparator2(x: Int, y: Int) =
        if (x > y) "$x is bigger than $y" else "$y is bigger than $x"

// PAGE-18
fun objectToColor(obj: Any): String =
        when (obj) {
            true -> "true"
            false -> "false"
            is Int -> "Integer"
            is String -> "String"
            else -> "None of them"
        }

// PAGE-22
fun checkString(obj: Any): Int {
    if (obj is String && obj.length > 0) {
        return obj.length
    } else {
        return -1
    }
}

// PAGE-25
// @Test
// fun addition_isCorrect() {
//     val str1 = "Hello"
//     val str2 = "World"
//     assertEquals("Hello World", str1, str2)
// }

// PAGE-37
data class User( // DTO
val id: Int, val username: String, val password: String, val email: String)

// PAGE-38
fun auth(username: String = "User1", password: String = "1234") {
    println("username: $username, password: $password")
}
