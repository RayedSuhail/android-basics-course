# Your First Android App
Learn programming basics and create your first Android app.

## Introduction to programming in Kotlin
Learn introductory programming concepts in Kotlin to prepare for building Android apps in Kotlin.

#### Before you begin & Welcome to Android Basics with Compose
Basic introduction to the course and the team that will be teaching the course. Not much to say here

#### Your first program in Kotlin
Kotlin is a modern programming language that helps developers be more productive. For example, Kotlin allows you to be more concise and write fewer lines of code for the same functionality compared to other programming languages. Apps that are built with Kotlin are also less likely to crash, resulting in a more stable and robust app for users.

This section goes through the basics of coding and how to code using the Kotlin language. This learning will be done in the [Kotlin Playground](https://developer.android.com/training/kotlinplayground) to get familiar with Kotlin and then setup for Android later in the course.

A basic "Hello World!" program will be written as follows in Kotlin:
```kt
fun main() {
  println("Hello, world!")
}
```

The section goes into description of how a computer learns how to read the program by utilizing a compiler: You need something called the Kotlin compiler, which takes the Kotlin code you wrote, looks at it line by line, and translates it into something that the computer can understand. This process is called compiling your code.

The main function is where the program starts running and is defined as `fun main() {...}`. in the code file. Function definition/declaration has three main requirements:
- Name of the function to use to call it
- Inputs required by the function which it uses to accomplish its purpose. Inputs are optional and some function do not require inputs
- Body of the function aka lines of code to implement the purpose of the function

The syntax for a function is as follows: `fun FN_NAME(PARAMS_LIST) {FN_BODY}`, where `fun` is the keyword for defining a function. Avoid using [Kotlin Keywords](https://kotlinlang.org/docs/keyword-reference.html#hard-keywords) as a function name and try to follow the camelCase convention like calculateTip, displayErrorMessage, or takePhoto.

Google has an Android coding standard for code written in Kotlin and this is referred as the [Kotlin style guide](https://developer.android.com/kotlin/style-guide). The complete guide is called a style guide and explains how code should be formatted in terms of visual appearance and the conventions to follow when writing your code. For example, the style guide includes recommendations on use of whitespace, indentation, naming, and more.

Kotlin does not seem to require a semi-colon as part of its style guide. The purpose of following the style guide is to make your code easier to read and more consistent with how other Android developers write their code. This consistency is important when collaborating on large projects together, so that the style of code is the same throughout all the files in the project.

Section Exercises:
1. Can you read the code in this program and guess what the output is (without running it in Kotlin Playground)?
```kt
fun main() {
    println("1")
    println("2")
    println("3")
}
```
Once you have a guess, copy and paste this code into the Kotlin Playground to check your answer.

2. Use the Kotlin Playground to create a program that outputs the following messages:
```
I'm
learning
Kotlin!
```

3. Copy and paste this program into the Kotlin Playground.
```kt
fun main() {
    println("Tuesday")
    println("Thursday")
    println("Wednesday")
    println("Friday")
    println("Monday")
}
```
Fix the program so that it prints this output:
```
Monday
Tuesday
Wednesday
Thursday
Friday
```
For some early practice on troubleshooting, fix the errors in the following exercises. For each exercise, copy the code into the Kotlin Playground in your browser. Try to run the program and you'll see an error message appear.

4. Fix the error in this program, so that it produces the desired output.
```kt
fun main() {
    println("Tomorrow is rainy")
```
Desired output:
```
Tomorrow is rainy
```

5. Fix the error in this program, so that it produces the desired output.
```kt
fun main() {
    printLine("There is a chance of snow")
}
```
Desired output:
```
There is a chance of snow
```

6. Fix the error in this program, so that it produces the desired output.
```kt
fun main() {
    println("Cloudy") println("Partly Cloudy") println("Windy")
}
```
Desired output:
```
Cloudy
Partly Cloudy
Windy
```

7. Fix the error in this program, so that it produces the desired output.
```kt
fun main() (
    println("How's the weather today?")
)
```

Desired output:
```
How's the weather today?
```

After you complete these exercises, check your answers against the solutions in the next section.

#### Create and use variables in Kotlin
In this codelab, you learn how to write code that uses variables so that certain parts of your program can change without having to write a whole new set of instructions. You will use the Kotlin Playground as you did in the previous codelab.

The section goes into information regarding the use of variables and why it is needed. And gives real-world examples of variables being used and the corresponding data type for the variable. The common basic data types in Kotlin are:
- String
- Int
- Double
- Float
- Boolean

In Kotlin, you need to first define the variable name and the corresponding data type associated with it. A variable declaration follows the following format (similar to TypeScript): `val VAR_NAME: DATA_TYPE = INIT_VAL`. The `val` keyword makes the variable a constant wheras the `var` keyword allows a variable to be reassigned. Constants defined by `val` need to have UPPER_SNAKE_CASE formatting.

The fixed or constant values, like 32, "Search", true, false or 2.0, assigned to variables are referred to as DATA_TYPE literals. If you don't provide an initial value when you declare a variable, you must specify the type. If you provide a value, there is no need to define type as it is inferred from the initialization.

To have a dynamic string, aka create a string template, use a method similar to PHP where the string template will be: `"String uses $VAR_NAME to fill it."`. You can also use curly braces to perform some expression such as by doing: `"You have ${unreadCount + readCount} total messages in your inbox.`

Kotlin has both increment (VAR_NAME++) and decrement (VAR_NAME--) operators to be utilized. It also has string concatenation in the form of `str1 + str2` and the quotation mark can be escaped with `\`. A few more conventions to follow regarding variables are: 
- Variable names should be in camel case and start with a lowercase letter.
- In a variable declaration, there should be a space after a colon when you specify the data type: `val discount: Double = .20`
- There should be a space before and after an operator like the assignment (=), addition (+), subtraction (-), multiplication (*), division (/) operators and more: `var pet = "bird"` and `val sum = 1 + 2`
- As you write more complex programs, there is a recommended limit of 100 characters per line. That ensures that you can read all the code in a program easily on your computer screen, without needing to scroll horizontally when reading code.

You can use comments in your code like this:
```kt
/**
 * This program displays the number of messages
 * in the user's inbox.
 */
fun main() {
    // Create a variable for the number of unread messages.
    var count = 10
    println("You have $count unread messages.")

    // Decrease the number of messages by 1.
    count--
    println("You have $count unread messages.")
}
```

#### Create and use functions in Kotlin
Functions let you break up your code into reusable pieces, rather than include everything in main(). Functions are an essential building block of Android apps and learning how to define and use them is a major step on your journey to become an Android developer. Creating functions to break up code into chunks is useful for:
- *Reusable code:* Rather than copying and pasting code that you need to use more than once, you can simply call a function wherever needed.
- *Readability:* Ensuring functions do one and only one specific task helps other developers and teammates, as well as your future self to know exactly what a piece of code does.

Functions do not need to be written exclusively on top of the file or on the bottom. I assume all function definitions are moved to the top of the file by the compiler as is the case with JavaScript. By default a function has a return type of `Unit` which is similar to void in C++ or None in Python. To define the return type of a function:
```kt
fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
```

Unlike in some languages, such as Java, where a function can change the value passed into a parameter, parameters in Kotlin are immutable. You cannot reassign the value of a parameter from within the function body. You can define functions with parameters as follows:
```kt
fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}
```

Although you often find them used interchangeably, a parameter and an argument aren't the same thing. When you define a function, you define the parameters that are to be passed to it when the function is called. When you call a function, you pass arguments for the parameters. Parameters are the variables accessible to the function, such as a name variable, while arguments are the actual values that you pass, such as the "Rover" string.

To call the function from the main function, you can use the following two methods:
```kt
println(birthdayGreeting("Rex", 2))
```
```kt
println(birthdayGreeting(age = 2, name = "Rex"))
```

You can provide some default values to the parameters when defining a function. You do not need to assign all values to the right of the first default parameter.

```kt
fun birthdayGreeting(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name! You are now $age years old!"
}
```

#### For additional practice, check out the [Kotlin Basics track](https://hyperskill.org/tracks/18) in JetBrains Academy

---

## Setup Android Studio
Install and set up Android Studio, so that you can create your first project and run it on a device or emulator.


#### Download and Install Android Studio
Quick installation guide for all systems

#### Create your first android app
Attempting to build an app that lets you customize your introduction! This project will use an empty template: New Project Phone and Tablet templates > Empty Activity template. Just rename project name as "Greeting Card" and then let it build.

Click `Split` on the top right of Android Studio, this allows you to view both code and design. You can also click `Code` to view code only or click `Design` to view design only. You can see three panes:
- The Project view shows the files and folders of your project
- The Code view is where you edit code
- The Design view is where you preview what your app looks like

If the file heirarchy ever looks weird, check to make sure you are still in Android view. Look at the Code view of the `MainActivity.kt` file. Notice there are some automatically generated functions in this code, specifically the `onCreate()` and the `setContent()` functions. For Android apps, the `onCreate()` function is the entry point that calls other functions to build the user interface.

The `setContent()` function within the `onCreate()` function is used to define your layout through composable functions. All functions marked with the `@Composable` annotation can be called from the `setContent()` function or from other Composable functions. The annotation tells the Kotlin compiler that this function is used by Jetpack Compose to generate the UI. The way to write `@Composable` functions:
- You add the @Composable annotation before the function.
- @Composable function names are capitalized.
- @Composable functions can't return anything.

```kt
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(text = "Hello $name!")
}
```

The `GreetingPreview()` function is a cool feature that lets you see what your composable looks like without having to build your entire app. To enable a preview of a composable, annotate it with `@Composable` and `@Preview`. The `@Preview` annotation tells Android Studio that this composable should be shown in the design view of this file.

To set a different background color for your introduction, you'll need to surround your text with a `Surface`. A `Surface` is a container that represents a section of UI where you can alter the appearance, such as the background color or border.

In your code, the best practice is to keep your imports listed alphabetically and remove unused imports. To do this press Help on the top toolbar, type in optimize imports, and click on Optimize Imports.

A `Modifier` is used to augment or decorate a composable. One modifier you can use is the padding modifier, which adds space around the element (in this case, adding space around the text). This is accomplished by using the `Modifier.padding()` function. 

###### Your final MainActivity.kt will look like:
```kt
package com.example.greetingcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.greetingcard.ui.theme.GreetingCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GreetingCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Surface(color = Color.Cyan) {
        Text(text = "Hi, my name is $name!", modifier = modifier.padding(24.dp))
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GreetingCardTheme {
        Greeting("Meghan")
    }
}
```

#### Run your first app on the Android Emulator
To run an Android app in an emulator on your computer, you first create a virtual device. Follow the following steps:
- In Android Studio, select Tools > Device Manager
- Click Create virtual device
- Select Phone as the category
- Select a phone, such as the Pixel 5, and then click Next
- If there's a download link next to S, click Download > Accept > Next > Finish. The presence of the download link indicates that the image isn't installed on your computer, in which case you must install the image before you can configure the virtual device. Expect the download to take some time to complete
- In the Recommended tab, choose S as the version of Android to run on the virtual device
- In the AVD Name field, enter a name for your AVD or use the default. Leave the rest of the fields unchanged
- Click Finish
- Close the Device Manager dialog

Now you can run the app on the Android Emulator
- Select the virtual device that you created from the dropdown menu at the top of the Android Studio window
- Click the start button

#### How to connect you Android device
Learn how to connect your app in Android Studio to your physical Android device. First, you need to enable USB debugging on your device. Go to About Phone and tap Build number multiple times to enable Develper mode. In the Developer options, enable USB debuggin and connect your device to the computer. On Windows:
- In Android Studio, click Tools > SDK Manager. The Preferences > Appearance & Behavior > System Settings > Android SDK dialog opens.
- Click the SDK Tools tab.
- Select Google USB Driver and then click OK.

Once that is then, connect your device and allow debugging on your phone. Now you can launch apps on your device.