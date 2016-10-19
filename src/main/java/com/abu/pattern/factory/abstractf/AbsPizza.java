package com.abu.pattern.factory.abstractf;

import com.abu.pattern.factory.abstractf.material.Cheese;
import com.abu.pattern.factory.abstractf.material.Clam;
import com.abu.pattern.factory.abstractf.material.Dough;
import com.abu.pattern.factory.abstractf.material.Sauce;

public abstract class AbsPizza {
	protected String name;
	
	protected Dough dough;
	protected Sauce sauce;
	protected Cheese cheese;
	protected Clam clam;
	
	protected abstract void prepare();
	
	protected void bake(){}
	protected void cut(){}
	protected void box(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
