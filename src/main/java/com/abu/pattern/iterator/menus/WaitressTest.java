package com.abu.pattern.iterator.menus;

public class WaitressTest {
	public static void main(String []args){
		Waitress waitress = new Waitress(new MenuOne(), new MenuTwo(), new MenuThree());
		waitress.printMenu();
	}
}
