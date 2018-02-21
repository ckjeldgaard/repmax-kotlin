package model.business

import model.formula.*

class RepmaxFormulaBuilder : FormulaBuilder {

    override fun getFormulas(): Array<Formula> {
        return arrayOf(
                LombardiFormula(),
                EpleyFormula(),
                McGlothinFormula(),
                BrzyckiFormula(),
                MayhewFormula(),
                WathanFormula()
        )
    }
}