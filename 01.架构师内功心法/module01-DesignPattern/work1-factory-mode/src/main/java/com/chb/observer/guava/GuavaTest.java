package com.chb.observer.guava;

import com.google.common.eventbus.EventBus;

public class GuavaTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        GuavaEvent guavaEvent = new GuavaEvent();
        GuavaEvent guavaEvent2 = new GuavaEvent();
        eventBus.register(guavaEvent);
        eventBus.register(guavaEvent2);
        eventBus.post("tom");
    }
}
