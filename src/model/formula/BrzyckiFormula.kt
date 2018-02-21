package model.formula

import util.Constants.Companion.DEFAULT_FORMULA_SIZE
import kotlin.math.floor

class BrzyckiFormula : Formula {

    override fun name(): String {
        return "Brzycki"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = weight.toDouble() * (36.0 / (37.0 - reps.toDouble()))
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..DEFAULT_FORMULA_SIZE) {
            rms.add(floor(
                    (oneRM * (37.0 - i.toDouble()) / 36.0)
            ).toInt())
        }
        return rms.toIntArray()
    }
}