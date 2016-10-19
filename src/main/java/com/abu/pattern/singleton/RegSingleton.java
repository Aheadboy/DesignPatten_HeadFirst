package com.abu.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class RegSingleton {

	private static HashMap<String, RegSingleton> m_registry = new HashMap<String, RegSingleton>();

	protected RegSingleton() {
	}

	public static RegSingleton getInstance(Class regSingletonClass) throws SecurityException, NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
		if (regSingletonClass != null) {
			if (!m_registry.containsKey(regSingletonClass.getName())) {
				synchronized (RegSingleton.class) {
					if (!m_registry.containsKey(regSingletonClass.getName())) {
						Constructor constructor = regSingletonClass.getDeclaredConstructor(new Class[]{});
						constructor.setAccessible(true);
						RegSingleton regSingleton = (RegSingleton) constructor.newInstance(new Object[]{});
						if (regSingleton != null) {
							m_registry.put(regSingletonClass.getName(),regSingleton);
						}
					}
				}
			}
		}

		return (RegSingleton) m_registry.get(regSingletonClass.getName());
	}
}