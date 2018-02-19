package components

import model.business.FormulaBuilder
import model.business.FormulaMatrix
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.*

interface ResultProps : RProps {
    var weight: Int
    var reps: Int
    var formulaBuilder: FormulaBuilder
}

class Result(props: ResultProps) : RComponent<ResultProps, RState>(props) {

    private fun buildMatrix(): Array<Array<Int>> {
        return FormulaMatrix(
                this.props.weight,
                this.props.reps,
                this.props.formulaBuilder.getFormulas()
        ).build()
    }

    override fun RBuilder.render() {
        val matrix = buildMatrix()
        console.log(matrix)
        div("result") {
            table {
                thead {
                    tr {
                        th { +"RM" }
                        th { +"Average" }
                        for (item in props.formulaBuilder.getFormulas()) {
                            th { +item.name() }
                        }
                    }
                }
                tbody {
                    for(i in matrix.indices) {
                        tr {
                            td { +"RM" }
                            td { +"Avg" }
                            for(j in matrix[i].indices) {
                                td {
                                    +"c ${matrix[i][j]}"
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun RBuilder.result(weight: Int, reps: Int, formulaBuilder: FormulaBuilder) = child(Result::class) {
    attrs.weight = weight
    attrs.reps = reps
    attrs.formulaBuilder = formulaBuilder
}