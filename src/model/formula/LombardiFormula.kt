package model.formula

import kotlin.math.floor
import kotlin.math.pow

class LombardiFormula : Formula {
    override fun name(): String {
        return "Lombardi"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = weight.toDouble() * reps.toDouble().pow(1.0 / 10.0)
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..10) {
            rms.add(floor(oneRM / i.toDouble().pow(1.0 / 10.0)).toInt())
        }
        return rms.toIntArray()
    }
}