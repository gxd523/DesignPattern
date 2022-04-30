package com.gxd.demo.design.pattern.chain.event.impl;

import com.gxd.demo.design.pattern.chain.event.Event;
import com.gxd.demo.design.pattern.chain.event.EventHandler;

public class ViewGroup extends EventHandler {
    @Override
    protected boolean consumeEvent(Event event) {
        return false;
    }
}