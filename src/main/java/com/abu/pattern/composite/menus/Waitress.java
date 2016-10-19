package com.abu.pattern.composite.menus;

import java.util.Iterator;

public class Waitress {
	
	MenuOne menuOne;
	MenuTwo menuTwo;
	MenuThree menuThree;
	
	public Waitress(MenuOne menuOne, MenuTwo menuTwo, MenuThree menuThree){
		this.menuOne = menuOne;
		this.menuTwo = menuTwo;
		this.menuThree = menuThree;
	}
	
	public void printMenu(){
		Iterator<MenuItem> menuOneIter = menuOne.createIterator();
		Iterator<MenuItem> menuTwoIter = menuTwo.createIterator();
		Iterator<MenuItem> menuThreeIter = menuThree.createIterator();
		
		System.out.println("Menu One List");
		printMenu(menuOneIter);
		System.out.println("Menu Two List");
		printMenu(menuTwoIter);
		System.out.println("Menu Three List");
		printMenu(menuThreeIter);
	}
	
	private void printMenu(Iterator<MenuItem> iter){
		while (iter.hasNext()) {
			MenuItem menuItem = (MenuItem) iter.next();
			System.out.print(menuItem.getName()+", "+menuItem.getPrice()+" -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
