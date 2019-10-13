package com.chb.observer.events;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 监听器
 */
public class EventLisenter {
    protected Map<String, Event> events = new HashMap<String, Event>();
    public void addLisenter(String eventType, Object target) {
        try {
            this.addLisenter(eventType, target, target.getClass().getMethod("on" +
                    toUpperFirstCase(eventType),Event.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
    public void addLisenter(String eventType, Object target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }
    //触发，只要有动作触发
    private void trigger(Event event){
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        if(event.getCallback() != null){
            try {
                event.getCallback().invoke(event.getTarget(),event);
            } catch (Exception e) { e.printStackTrace(); }
        }
    }
    //事件名称触发
    protected  void trigger(String trigger){
        if(!this.events.containsKey(trigger)){return;}
        trigger(this.events.get(trigger).setTrigger(trigger));
    }
    //逻辑处理的私有方法，首字母大写
    private String toUpperFirstCase(String str) {
        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }
}
