import java.util.Random

fun main(args: Array<String>) {
    var fortune : String
    for (i in 1..10) {
        fortune = getFortuneCookie(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break
    }
}

fun getBirthday(): Int {
    return Random().nextInt(30) + 1
}

fun getFortuneCookie(birthday: Int): String {
    when (birthday) {
        in 1..7 -> return "You will have a great week!"
        28, 31 -> return "You will have a great month!"
        else -> return "Take it easy"
    }
}
