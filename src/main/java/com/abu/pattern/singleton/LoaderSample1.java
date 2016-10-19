package com.abu.pattern.singleton;

public class LoaderSample1 {
	public static void main(String[] args) {
		Class c;
		ClassLoader cl;
		cl = ClassLoader.getSystemClassLoader();
		System.out.println(cl);
		while (cl != null) {
			cl = cl.getParent();
			System.out.println(cl);
		}
		try {
			c = Class.forName("java.lang.Object");
			cl = c.getClassLoader();
			System.out.println("java.lang.Object's loader is " + cl);
			
			c = Class.forName("java.applet.Applet");
			cl = c.getClassLoader();
			System.out.println("java.applet.Applet's loader is " + cl);
			
			c = Class.forName("com.abu.pattern.singleton.LoaderSample1");
			cl = c.getClassLoader();
			System.out.println("LoaderSample1's loader is " + cl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}