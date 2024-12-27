package com.gxd.design.pattern.behavioral.chain.event

/**
 * 责任链模式
 * 类似递归，dispatchEvent()内调用dispatchEvent()
 * 只是dispatchEvent()所属的对象不是同一个
 */
abstract class EventHandler {
    private var mNextHandler: EventHandler? = null

    fun dispatchEvent(event: Event?): Boolean {
        if (consumeEvent(event)) {
            return true
        } else {
            val nextHandler = mNextHandler
            if (nextHandler != null) {
                return nextHandler.dispatchEvent(event)
            } else {
                println("no body handle event!")
                return false
            }
        }
    }

    fun setNextHandler(nextHandler: EventHandler?) {
        this.mNextHandler = nextHandler
    }

    protected abstract fun consumeEvent(event: Event?): Boolean
}
