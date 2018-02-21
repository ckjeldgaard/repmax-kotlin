package model.formula

import util.Constants.Companion.DEFAULT_FORMULA_SIZE
import kotlin.math.floor

class McGlothinFormula : Formula {

    override fun name(): String {
        return "McGlothin"
    }

    override fun repmax(weight: Int, reps: Int): IntArray {
        val oneRM = (100.0 * weight.toDouble()) / (101.3 - 2.67123 * reps.toDouble())
        val rms = arrayListOf(floor(oneRM).toInt())
        for (i in 2..DEFAULT_FORMULA_SIZE) {
            rms.add(floor(
                    (oneRM * (101.3 - 2.67123 * i.toDouble())) / 100.0
            ).toInt())
        }
        return rms.toIntArray()
    }
}