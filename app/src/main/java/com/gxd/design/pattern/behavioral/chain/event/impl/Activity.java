package com.gxd.design.pattern.behavioral.chain.event.impl;

import com.gxd.design.pattern.behavioral.chain.event.Event;
import com.gxd.design.pattern.behavioral.chain.event.EventHandler;

public class Activity extends EventHandler {
    @Override
    protected boolean consumeEvent(Event event) {
        return false;
    }
}
