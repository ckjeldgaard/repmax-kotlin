package components.home

import components.range.range
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.article
import react.dom.p

class Home : RComponent<RProps, RState>() {

    private val DEFAULT_WEIGHT: Int = 50

    override fun RBuilder.render() {
        article {
            p {
                +"Welcome to React with Kotlin"
            }
            range(id = "weightRange", label = "Weight", abbr = " kg. ", min = 0, max = 200, step = 2, default = DEFAULT_WEIGHT, inputHandler = { w -> changeWeight(w) })
        }
    }

    private fun changeWeight(weight: Int) {
        console.log("Changed weight = " + weight)
    }

    // <Range label='Weight' abbr=' kg.' min={0} max={200} step={2} default={this.DEFAULT_WEIGHT} inputHandler={this.changeWeight}/>

}

fun RBuilder.home() = child(Home::class) {}