package com.abu.pattern.composite.menus;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MenuThree implements Menu{
	
	private Map<String, MenuItem> menuItems;
	
	public MenuThree(){
		this.menuItems = new TreeMap<String, MenuItem>();
		
		addItem("Menu3Item1", "Menu3Item1", false, 30d);
		addItem("Menu3Item2", "Menu3Item2", true, 31d);
		addItem("Menu3Item3", "Menu3Item3", true, 32d);
		addItem("Menu3Item4", "Menu3Item4", true, 33d);
		addItem("Menu3Item5", "Menu3Item5", false, 34d);
		addItem("Menu3Item6", "Menu3Item6", false, 35d);
	}
	
	public void addItem(String name, String desc, Boolean veg, Double price) {
		MenuItem item = new MenuItem(name, desc, veg, price);
		menuItems.put(item.getName(), item);
	}

	public Iterator<MenuItem> createIterator() {
		return menuItems.values().iterator();
	}

}
