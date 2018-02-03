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
/**
 * 	情形：
 * 	1、存在Turkey，功能能够满足Duck接口
 * 	例如：
 * 	Turkey的gobble()相当于Duck的quack()
 * 	Turkey的fly()相当于Duck的fly()
 * 	2、但是他们的接口不相兼容。
 * 	通过Duck的接口不能够全部调用Turkey的功能。
 * 	3、通过一个adapter能够将它们进行适配。
 *
 * 	实现方式：
 * 	1、adapter实现现有的接口（Duck）
 *	2、adapter内组合了adaptee（Turkey），持有adapee（Turkey）的引用。
 *	3、现有接口（Duck）指向adapter实例。
 *
 * 	使用：
 * 	当现有接口（Duck)调用功能时，
 * 	adapter内部能够去调用Turkey相匹配，但不兼容的功能。
 *
 * 	由此实现适配。
 */