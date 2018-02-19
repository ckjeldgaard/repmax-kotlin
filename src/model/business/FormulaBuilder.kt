package model.business

import model.formula.Formula

interface FormulaBuilder {
    fun getFormulas(): Collection<Formula>
}