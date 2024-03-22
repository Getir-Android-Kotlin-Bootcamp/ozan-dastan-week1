import java.lang.invoke.StringConcatException // PAGE-24

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
    auth() // default function parameters

    // PAGE-39
    println("PAGE-39")
    val cityList = listOf("Bursa", "Istanbul", "Ankara")
    println(cityList.filter { it.startsWith("B") }) // filter with one condition

    // PAGE-40
    println("PAGE-40")
    if ("Ankara" in cityList) {
        println("Ankara is in the List")
    }

    // PAGE-41
    println("PAGE-41")
    when (user) {
        is User -> println("user instance is an User")
    }

    // PAGE-43-44
    println("PAGE-43-44")
    val map = mapOf("A" to 1, "B" to 2, "C" to 3)
    for ((k, v) in map) {
        println("$k -> $v")
    }

    // PAGE-45
    println("PAGE-45")
    val lazyVal: String by lazy {
        println("The value will be assigned on first use")
        "Lazy Value"
    }

    // PAGE-46
    println("PAGE-46")
    println(5.isOdd())

    // PAGE-47
    println("PAGE-47")
    SingletonObject.singletonFunction() // Singleton instance

    // PAGE-48
    println("PAGE-48")
    val player = Player()
    player.Walk()

    // PAGE-49-50-51
    println("PAGE-49-50-51")
    val text4: String? = null
    println(text4?.length) // null check, run if it is not null
    println(text4?.length ?: "text4 is null") // check if it is null, run the code if null

    val runIfNull =
            text4?.length
                    ?: run { // run multiple line if it's null
                        println("Running first line")
                        println("Running second line")
                    }
    // val text5 = text4 ?: throw IllegalStateException("Value is null")

    // PAGE-52
    println("PAGE-52")
    val objList = listOf(null)
    val tempObj = objList.firstOrNull() ?: "null list"
    println(tempObj)

    // PAGE-53
    println("PAGE-53")
    val sayi8 = 5
    sayi8.let { println("sayi8 is not null") } // let runs the code if value is not null

    // PAGE-54
    println("PAGE-54")
    val checkNullOrNot = text4?.let { print("text4 is not Null") } ?: "text4 is null"
    println(checkNullOrNot)

    // PAGE-55
    println("PAGE-55")
    println("Player state = ${playerState(2)}")

    // PAGE-56
    println("PAGE-56")
    reachProfile()

    // PAGE-58
    println("PAGE-58")
    val text6 =
            if (sayi8 > 3) {
                "$sayi8 is bigger than 3"
            } else {
                "$sayi8 is smaller than 3"
            }
    println(text6)

    // PAGE-59
    println("PAGE-59")
    fillArrayWith(5, 8).forEach { print(it) }

    // PAGE-60
    println("PAGE-60")
    println(fncReturn50())

    // PAGE-61
    println("PAGE-61")
    val playerController = PlayerController()
    with(playerController) {
        Walk()
        Run()
        turnRight()
    }

    // PAGE-62
    println("PAGE-62")
    val enemy = Enemy().apply { enemyHealth = 50 }

    // PAGE-64
    println("PAGE-64")
    genericFunction("text")

    // PAGE-65
    println("PAGE-65")
    var text7 = "Deneme1"
    text7 =
            text7.also {
                println(text7)
                text7 = "Deneme2"
                println(text7)
            }

    // PAGE-67
    println("PAGE-67")
    createEnemy("Bot1", 80)
    createEnemy("Bot1")
    createEnemy(health = 60, name = "Bot2")

    // PAGE-68
    println("PAGE-68")
    println(5 add 3) // infix

    // PAGE-69
    println("PAGE-69")
    val point = Point(5, 10)
    println(-point)

    // PAGE-70
    println("PAGE-70")
    printStrings("Ozan", "Metin", "Meto")

    // PAGE-71
    println("PAGE-71")
    var sayi9: Int = 1 // mutable
    val sayi10 = 2 // immutable

    // PAGE-72
    println("PAGE-72")
    val text8: String? = "patikadev" // nullable val

    // PAGE-73
    println("PAGE-73")
    println(calculateLength("patikaDev"))

    // PAGE-74
    println("PAGE-74")
    val obj = ObjectShape(5, 11)
    println(obj.height)

    // PAGE-75
    println("PAGE-75")
    val myGeneric = MyGenericClass("genericClassText")
    println(myGeneric.name)
    val myGeneric2 = MyGenericClass(55)
    println(myGeneric2.name)

    // PAGE-76
    println("PAGE-76")
    val middleInteger: Int = middleItem(listOf(1, 2, 3, 4, 5))
    println(middleInteger)

    // PAGE-77-78-79
    println("PAGE-77")
    val weapon: Weapon = Gun("Pistol")
    weapon.Hit()
    val gun: Gun = Pistol("Colt")
    gun.Hit()

    // PAGE-80
    println("PAGE-80")
    fncCases(55)

    // PAGE-81
    println("PAGE-81")
    println(fncWhen(0))

    // PAGE-82
    println("PAGE-82")
    val countryNames = listOf("Turkey", "Germany", "Greece", "England")
    for (country in countryNames) {
        println("Country name is $country")
    }

    // PAGE-83
    println("PAGE-83")
    var whileLoopCounter = 0
    while (whileLoopCounter < 10) {
        print(whileLoopCounter)
        whileLoopCounter++
    }
    println()
    // PAGE-84
    println("PAGE-84")
    var doWhileLoopCounter = 0
    do {
        print(doWhileLoopCounter)
        doWhileLoopCounter++
    } while (doWhileLoopCounter < 15)
    println()
    // PAGE-85
    println("PAGE-85")
    for (i in 1..5) {
        print(i)
    }
    println()
    for (i in 3 until 6) {
        print(i)
    }
    println()
    for (i in 1..9 step 3) {
        print(i)
    }
    println()
    for (i in 10 downTo 5) {
        print(i)
    }
    println()
    // PAGE-86
    println("PAGE-86")
    for (x in 't'..'z') {
        print(x)
    }
    println()
    for (x in 't' downTo 'h' step 3) {
        print(x)
    }
    println()
    // PAGE-87
    println("PAGE-87")
    var tempX = 5
    if (tempX in 1..5) {
        println("tempX is in range")
    }

    // PAGE-88
    println("PAGE-88")
    val num1: Int = 10
    val num2: Int = 10
    var num3: Int? = 15
    println(num1 == num2)
    println(num1 == num3)
    println(num1 === num2)
    num3 = num1
    println(num1 === num3)

    // PAGE-89
    println("PAGE-89")
    println(fncComparator(3, 7))

    // PAGE-91-92
    println("PAGE-91-92")
    var movie1 = Movie("Saw", 2005, "Horror", 5.5)
    var movie2 = Movie("Goodfellas", 1996, "Action", 8.5)
    println("is equal?: ${movie1.equals(movie2)}")
    println("hasCode?: ${movie1.hashCode()}")
    val copyMovie = movie1.copy(imdb = 9.9)
    println("copy Film: $copyMovie")

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

// PAGE-46
fun Int.isOdd(): String { // Extension method
    if (this % 2 == 1) {
        return "$this is odd"
    } else {
        return "$this is not odd"
    }
}

// PAGE-47
object SingletonObject {
    init {
        println("Singleton init")
    }
    fun singletonFunction() {
        println("Singleton Function")
    }
}

// PAGE-48
abstract class Character { // abstract class
    abstract fun Walk()
}

class Player : Character() {
    override fun Walk() {
        println("Player Walking")
    }
}

// PAGE-55
fun playerState(stateNum: Int): String {
    return when (stateNum) {
        0 -> "Idle"
        1 -> "Defense"
        2 -> "Attack"
        else -> "None"
    }
}

// PAGE-56
fun reachProfile() {
    val result =
            try {
                println("Reaching the profile")
            } catch (e: StringConcatException) {
                println(e)
            }
}

// PAGE-59
fun fillArrayWith(size: Int, fillWith: Int): IntArray {
    return IntArray(size).apply { fill(fillWith) }
}

// PAGE-60
fun fncReturn50() = 50

// PAGE-61
class PlayerController {
    fun Walk() {}
    fun Run() {}
    fun turnRight() {}
}

// PAGE-62
class Enemy {
    var enemyHealth = 100
    var enemyWeapon = "Knife"
}

// PAGE-64
inline fun <reified T> genericFunction(value: T) {
    val typeName = T::class.simpleName
    println("The type of the value is: $typeName")
}
// PAGE-66
fun fncTodo(): String = TODO("Add an example with it keyword")

// PAGE-67
fun createEnemy(name: String, health: Int = 100) { // default parameters
    println("$name spawning with $health health")
}

// PAGE-68
infix fun Int.add(other: Int): Int {
    return this + other
}

// PAGE-69
data class Point(val x: Int, val y: Int)

operator fun Point.unaryMinus() = Point(-x, -y)

// PAGE-70
fun printStrings(vararg x: String) {
    x.forEach { println(it) }
}

// PAGE-73
fun calculateLength(strVal: String?): Int {
    if (strVal != null && strVal.length > 0) {
        return strVal.length
    } else {
        return -1
    }
}

// PAGE-74
class ObjectShape(val height: Int, val width: Int)

// PAGE-75
class MyGenericClass<T>(text: T) {
    var name = text
}

// PAGE-76
fun <T> middleItem(list: List<T>): T = list[list.size / 2]

// PAGE-77-78-79
open class Weapon() {
    open fun Hit() {
        println("Hit")
    }
}

open class Gun(val name: String) : Weapon() {
    override fun Hit() {
        println("Shoot")
    }
}

class Pistol(pistolName: String) : Gun(name = pistolName)

// PAGE-80
fun fncCases(obj: Any) {
    when (obj) {
        true -> println("true")
        false -> println("false")
        is Int -> println("Integer")
        is String -> println("String")
        else -> println("None of them")
    }
}

// PAGE-81
fun fncWhen(obj: Any): Any {
    return when (obj) {
        0 -> "Zero"
        "1" -> 1
        is Double -> true
        else -> "None"
    }
}
// PAGE-89
fun fncComparator(x: Int, y: Int) = if (x > y) x else y

// PAGE-91-92
data class Movie(val name: String, val year: Int, val type: String, val imdb: Double) {
    //operator fun getName(): String {
    //     return name
    // }
    //operator fun getYear(): Int {
    //     return year
    // }
    //operator fun getType(): String {
    //     return type
    // }
}
