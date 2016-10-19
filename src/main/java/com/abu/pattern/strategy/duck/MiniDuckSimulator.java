package com.abu.pattern.strategy.duck;

import com.abu.pattern.strategy.duck.base.Duck;
import com.abu.pattern.strategy.duck.behavior.impl.FlyRocketPowered;

public class MiniDuckSimulator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Duck mallard = new MallardDuck();
		//mallard.performQuack();
		//mallard.performFLy();
		
		Duck model = new ModelDuck();
		model.performFLy();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFLy();
		
	}

}
