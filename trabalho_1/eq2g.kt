package org.gxbrxxlkk.calc_eq2

import kotlin.math.sqrt

class eq2g(val a : Double = 0.0, val b : Double = 0.0 , val c : Double = 0.0) {

    val delta = calcula_delta()
    var vertice = calcula_vertice()
    var x1 = calcula_x1()
    var x2 = calcula_x2()
    var concavo = if(a > 0) true else false
    fun calcula_delta() : Double {
        return ((b*b) - (4 * a * c))
    }

    fun calcula_vertice() : List<Double> {

        return listOf((-b / (2 * a)), (-delta / (4 * a)))

    }

    fun calcula_x1() : Double {
        if (delta < 0) {
            return -1.0
        } else
            return ((-b + sqrt(delta)) / (2 * a))
    }

    fun calcula_x2() : Double {
        if (delta < 0) {
            return -1.0
        } else
            return ((-b - sqrt(delta)) / (2 * a))
    }
}

