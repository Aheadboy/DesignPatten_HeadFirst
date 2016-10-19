package com.abu.pattern.singleton;

import java.lang.reflect.InvocationTargetException;

public class RegSingletonChild extends RegSingleton {
    private RegSingletonChild() {
    }
 
    public static RegSingletonChild getInstance() throws SecurityException, IllegalArgumentException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
       return (RegSingletonChild) RegSingleton.getInstance(RegSingletonChild.class );
    }
}