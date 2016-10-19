package com.abu.pattern.iterator.menus;

import java.util.Iterator;

public interface Menu {
	Iterator<MenuItem> createIterator();
	
	void addItem(String name, String desc, Boolean veg, Double price);
}
