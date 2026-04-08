@file:JvmName("JDoodle")

import kotlin.math.* 


class Eq2G() {

    // tem que especificar o tipo da saida da função, se não ele retorna o unit (void de outras linguagens)
    /*fun getDelta(a: Int, b : Int, c: Int): Double {
        return ((b*b) - (4*a*c)).toDouble()
    }
    
    fun getX1(a: Int, b : Int, delta : Double): Double {
        return (-b + sqrt(delta))/(2*a)
    }
    
    fun getX2(a: Int, b : Int, delta : Double): Double {
        return (-b - sqrt(delta))/(2*a)
    }
    */

    var a: Int = 0; var b: Int = 0; var c: Int = 0
    var delta: Double = 0.0
    public
    fun setDelta() {
        delta = ((b*b) - (4*a*c)).toDouble()
    }

    fun getX1(): Double {
        return (-b + sqrt(delta)) / (2 * a)
    }

    fun getX2(): Double {
        return (-b - sqrt(delta)) / (2 * a)
    }
    }
fun main(args: Array<String>) {
    val eq = Eq2G()
    var x1: Double = 0.0
    var x2: Double = 0.0
  //entradas
  
    println("\nEntre a: ")
    eq.a = readln().toInt()
    println("Entre b: ")
    eq.b = readln().toInt()
    println("Entre c: ")
    eq.c = readln().toInt()
    
    eq.setDelta()
    
  //var delta: Float = ((b*b) - (4*a*c)).toFloat() // Conversão feita por função
  //val delta = ((b*b) - (4*a*c)).toDouble() //Não necessáriamente preciso inferir o tipo do delta
 
  if (eq.delta >= 0) { 
  
    //x1 = (-b + sqrt(delta))/(2*a) // de preferencia usar val ao invés de var
    //x2 = (-b - sqrt(delta))/(2*a)
    x1 = eq.getX1()
    x2 = eq.getX2()
  
  }
  
  //Saida
    println("\n")
    println("Delta = ${eq.delta}")
  if (eq.delta >= 0) {
    println("X1 = $x1") 
    println("X2 = $x2")
  } else println("Fim")
}


// codigo kotlin é compilado para gerar o bytecode (igual java), basicamente um filho do java
// não preciso criar set e get dentro da classe, caso for só colocar o valor ou retirar, o kotlin já faz isso implicitamente


//Versão 2

class Eq2G(var a: Int, var b : Int, var c : Int) {
    //Declaração de atributos
    var delta: Double;
    init {
    this.delta = (b*b - 4*a*c).toDouble()
    }
    
    public
    fun setDelta() {
        delta = ((b*b) - (4*a*c)).toDouble()
    }

    fun getX1(): Double {
        return (-b + sqrt(delta)) / (2 * a)
    }

    fun getX2(): Double {
        return (-b - sqrt(delta)) / (2 * a)
    }
    }


fun main(args: Array<String>) {
    val eq = Eq2G(1, -3, 2)
    var x1: Double = 0.0
    var x2: Double = 0.0
 
  if (eq.delta >= 0) { 
  
    //x1 = (-b + sqrt(delta))/(2*a) // de preferencia usar val ao invés de var
    //x2 = (-b - sqrt(delta))/(2*a)
    x1 = eq.getX1()
    x2 = eq.getX2()
  //entradas
    println("\nEntre a: ")
    eq.a = readln().toInt()
      while(eq.a != 0) {
        println("Entre b: ")
        eq.b = readln().toInt()
        println("Entre c: ")
        eq.c = readln().toInt()
        
        eq.setDelta()
        
      //var delta: Float = ((b*b) - (4*a*c)).toFloat() // Conversão feita por função
      //val delta = ((b*b) - (4*a*c)).toDouble() //Não necessáriamente preciso inferir o tipo do delta
      
          println("\n*Entre a: ")
          eq.a = readln().toInt()
      
      
      }
      //Saida
        println("\n")
        println("Delta = ${eq.delta}")
      if (eq.delta >= 0) {
        println("X1 = $x1") 
        println("X2 = $x2")
    
      } else println("Fim")
      }
      
}


