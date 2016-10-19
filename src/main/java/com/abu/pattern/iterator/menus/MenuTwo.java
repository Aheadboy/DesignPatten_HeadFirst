package com.abu.pattern.iterator.menus;

import java.util.Iterator;

public class MenuTwo implements Menu{
	
	private static final Integer DEFAULT_MAX = 6;
	private int numberOfItems = 0;
	
	private MenuItem[] menuItems;
	
	public MenuTwo(){
		menuItems = new MenuItem[DEFAULT_MAX];
		
		addItem("Menu2Item1", "Menu2Item1", false, 20d);
		addItem("Menu2Item2", "Menu2Item2", true, 21d);
		addItem("Menu2Item3", "Menu2Item3", false, 22d);
		addItem("Menu2Item4", "Menu2Item4", true, 23d);
		addItem("Menu2Item5", "Menu2Item5", false, 24d);
	}
	
	public void addItem(String name, String desc, Boolean veg, Double price) {
		MenuItem item = new MenuItem(name, desc, veg, price);
		if(numberOfItems>=DEFAULT_MAX){
			System.err.println("Sorry, MenuTwo is full");
		}else{
			menuItems[numberOfItems] = item;
			numberOfItems++;
		}
	}

	public Iterator<MenuItem> createIterator() {
		return new MenuTwoIterator(menuItems);
	}

}
