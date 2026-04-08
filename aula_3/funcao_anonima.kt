@file:JvmName("JDoodle")

import kotlin.math.* 

fun func1( lamb : (Int, Int) -> Int) : Int { //A função tem como parametro um funcional (função anonima)
    val temp = lamb(7,9)
    return temp
}

fun func2(a : Int, b : Int, lamb : (Int, Int) -> Int) : Int {

    return lamb(a,b)
}

fun func3(lambd : (String) -> Unit) : Unit { //Posso omitir o unit, já que a função não vai retornar nada
    println("Alo pessoal")
}


fun main() {
    val mult1 : (Int, Int) -> Int = {a, b -> a*b}
    val mult2 = {a : Int, b : Int -> a * b}

    val add1 : (Int, Int) -> Int = {a, b -> a + b}
    val add2 = {a : Int, b : Int -> a + b}
    
    val m = mult1(5,7)
    println("\nm = $m")
    println("m2 = ${mult2(6,8)}")

    val x = func1(mult1) 
    val y = func1(add2)
    val z = func2(6,7, mult2)
    println("x = $x")
    println("y = $y")
    println("z = $z")
    
    val w = func2(6,9) {        //Só funciona quando o ultimo parâmetro é um funcional
        a : Int, b : Int -> a + b
    }
    println("w = $w")
    
    val printi = {s : String -> Unit}
    
    func3 {
        String -> Unit
    }

}



