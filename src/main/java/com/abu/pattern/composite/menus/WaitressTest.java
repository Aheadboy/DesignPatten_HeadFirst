package com.abu.pattern.composite.menus;

public class WaitressTest {
	public static void main(String []args){
		Waitress waitress = new Waitress(new MenuOne(), new MenuTwo(), new MenuThree());
		waitress.printMenu();
	}
}
