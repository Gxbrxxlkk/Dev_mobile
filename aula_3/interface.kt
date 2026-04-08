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















