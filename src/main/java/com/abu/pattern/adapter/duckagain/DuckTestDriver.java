package com.abu.pattern.adapter.duckagain;

public class DuckTestDriver {

	public static void main(String[] args) {
		WildTurkey turkey = new WildTurkey();
		TurkeyAdapter adapter = new TurkeyAdapter(turkey);
		
		testDuck(adapter);
	}
	
	private static void testDuck(Duck duck){
		duck.quack();
		duck.fly();
	}

}
