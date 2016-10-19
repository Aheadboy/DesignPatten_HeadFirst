package com.abu.pattern.singleton;

import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLClassLoader;

public class LoaderSample2 {
	public static void main(String[] args) {
		try {
			String path = System.getProperty("user.dir");
			System.out.println(path);
			URL[] us = { new URL("file://" + path + "/sub/") };
			ClassLoader loader = new URLClassLoader(us);
			Class c = loader.loadClass("com.abu.pattern.singleton.LoaderSample3");
			Object o = c.newInstance();
			Field f = c.getField("age");
			int age = f.getInt(o);
			System.out.println("age is " + age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}