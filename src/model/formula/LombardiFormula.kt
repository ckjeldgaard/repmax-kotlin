package model.formula

import kotlin.js.Math.pow
import kotlin.math.floor

class LombardiFormula : Formula {
    override fun name(): String {
        return "Lombardi"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = weight * pow(reps.toDouble(), (1 / 10).toDouble())
        val rms = IntArray(10)
        for (i in 2..10) {
            rms[i] = floor(oneRM / (pow(i.toDouble(), (1 / 10).toDouble()))).toInt()
            println(i)
        }
        return rms
    }
}