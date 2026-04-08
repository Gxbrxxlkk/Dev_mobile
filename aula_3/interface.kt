@file:JvmName("JDoodle")

import kotlin.math.* 

interface Vehicle {
    val speed: Int // Abstratct property
    fun drive()    // Abstract method
}

class Car(override val speed: Int) : Vehicle {  //Essa classe implementa a interface Vehicle, depois dos ':', vem a herança e a interface
    override fun drive() {
        println("Driving at $speed km/h")
    }
}

fun main() {

    val myCar = Car(120)
    
    println("\nVelocidade do carro: ${myCar.speed} km/h")
    
    myCar.drive()

    val vehicles : List<Vehicle> = listOf(
        Car(80),
        Car(150),
        Car(200)
    )
    
    println("---Dirigindo veiculos ---")
    vehicles.forEach { vehicle -> vehicle.drive() } //Funcional lambda?
    
}

//Parte 2
/*
@file:JvmName("JDoodle")

import kotlin.math.* 

fun interface Greeter {
    fun greet(item: String)
}

fun main(args : Array<String>) {

    val languages = listOf("Kotlin", "Java", "Swift", "C/C++", "Pascal/Object Pascal")
    
    fun greetLanguages(languages : List<String>, greeter : Greeter) {
        languages.forEach { greeter.greet(it)}
    }
    
    println("\nJava model")
    greetLanguages(languages, object : Greeter { override fun greet(item : String) { println("Hello $item") }})
    
    println("\nSAM Kotlin model")
    greetLanguages(languages) { println("Hello $it")}

}
*/











