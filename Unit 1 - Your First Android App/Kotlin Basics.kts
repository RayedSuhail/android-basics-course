// Can you write a main() function that prints these messages on four separate lines?
fun main() {
  println("Use the val keyword when the value doesn't change. ")
  println("Use the var keyword when the value can change.")
  println("When you define a function, you define the parameters that can be passed to it. ")
  println("When you call a function, you pass arguments for the parameters.")
}

// Fix compile error
fun main() { 
    println("New chat message from a friend")
}

// String templates
fun main() {
    var discountPercentage: Int = 0
    var offer: String = ""
    var item = "Google Chromecast"
    discountPercentage = 20
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    
    println(offer)
}

// String Concatenation
fun main() {
    val numberOfAdults = 20
    val numberOfKids = 30
    val total = numberOfAdults + numberOfKids
    println("The total party size is: $total")
}

// Message Formatting  
fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")
}

// Implement basic math operations
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}

// Implement add() and subtract() functions
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8
    
    val result = add(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

fun add(first: Int, second: Int): Int {
    return first + second
}

fun subtract(first: Int, second: Int): Int {
    return first - second
}

// Default Parameters
fun main() {
    val firstUserEmailId = "user_one@gmail.com"

    println(displayAlertMessage(emailId = firstUserEmailId))
    println()

    val secondUserOperatingSystem = "Windows"
    val secondUserEmailId = "user_two@gmail.com"

    println(displayAlertMessage(secondUserOperatingSystem, secondUserEmailId))
    println()

    val thirdUserOperatingSystem = "Mac OS"
    val thirdUserEmailId = "user_three@gmail.com"

    println(displayAlertMessage(thirdUserOperatingSystem, thirdUserEmailId))
    println()
}

fun displayAlertMessage(operatingSystem: String = "Unknown OS", emailId: String): String {
    return "There's a new sign-in request on $operatingSystem for your Google Account $emailId."
}

// Pedometer: Rename to follow best practices
fun main() {
    val steps = 4000
    val caloriesBurned = stepsToCalories(steps);
    println("Walking $steps steps burns $caloriesBurned calories") 
}

fun stepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedPerStep = 0.04
    val caloriesBurnt = numberOfSteps * caloriesBurnedPerStep
    return caloriesBurnt
}

// Compare two numbers
fun main() {
    var timeSpentToday = 300
    var timeSpentYesterday = 250
    var comp = comparison(timeSpentToday, timeSpentYesterday)
    println("Time today: $timeSpentToday\tTime yesterday: $timeSpentYesterday\t Greater? $comp")
	timeSpentToday = 300
    timeSpentYesterday = 300
    comp = comparison(timeSpentToday, timeSpentYesterday)
    println("Time today: $timeSpentToday\tTime yesterday: $timeSpentYesterday\t Greater? $comp")
	timeSpentToday = 200
    timeSpentYesterday = 220
    comp = comparison(timeSpentToday, timeSpentYesterday)
    println("Time today: $timeSpentToday\tTime yesterday: $timeSpentYesterday\t Greater? $comp")
}

fun comparison(larger: Int, smaller: Int): Boolean {
    return larger > smaller
}

// Move duplicate code into a function
fun main() {
    displayWeather("Ankara", 27, 31, 82)

    displayWeather("Tokyo", 32, 36, 10)
    
    displayWeather("Cape Town", 59, 64, 2)
    
    displayWeather("Guatemala City", 50, 55, 7)
}

fun displayWeather(cityName: String, tempLow: Int, tempHigh: Int, chanceOfRain: Int) {
    println("City: $cityName")
    println("Low temperature: $tempLow, High temperature: $tempHigh")
    println("Chance of rain: $chanceOfRain%")
    println()
}