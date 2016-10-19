package com.abu.pattern.composite.menus;

import java.util.Iterator;

public class MenuTwoIterator implements Iterator<MenuItem>{
	
	private MenuItem[] menuItems;
	private int position=0;
	
	public MenuTwoIterator(MenuItem[] menuItems){
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if(position >= menuItems.length || menuItems[position]==null){
			return false;
		}else{
			return true;
		}
	}

	public MenuItem next() {
		MenuItem item = menuItems[position];
		position ++;
		return item;
	}

	public void remove() {
		throw new UnsupportedOperationException("Unsupport remove operation for MenuTwo.");
	}

}
