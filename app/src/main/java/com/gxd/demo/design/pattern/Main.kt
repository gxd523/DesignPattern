package com.gxd.demo.design.pattern

import com.gxd.demo.design.pattern.state.CloseState
import com.gxd.demo.design.pattern.state.Context

fun main() {
    statePattern()
}

fun statePattern() {
    val context = Context()
    context.setCurrentState(CloseState())
    context.open()
    context.run()
    context.close()
    context.run()
    context.stop()
    context.open()
}