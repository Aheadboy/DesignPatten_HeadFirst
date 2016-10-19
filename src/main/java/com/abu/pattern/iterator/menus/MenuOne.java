package com.abu.pattern.iterator.menus;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MenuOne implements Menu{
	
	private List<MenuItem> menuItems;
	
	public MenuOne(){
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Menu1Item1", "Menu1Item1", false, 10d);
		addItem("Menu1Item2", "Menu1Item2", false, 11d);
		addItem("Menu1Item3", "Menu1Item3", false, 12d);
		addItem("Menu1Item4", "Menu1Item4", false, 13d);
	}
	
	public void addItem(String name, String desc, Boolean veg, Double price) {
		MenuItem item = new MenuItem(name, desc, veg, price);
		menuItems.add(item);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.iterator();
	}

}
