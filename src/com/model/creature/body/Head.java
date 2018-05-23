package com.model.creature.body;

import java.util.ArrayList;
import java.util.List;

public class Head implements java.io.Serializable {
	
	List<Internal> internals = new ArrayList<>();
	
	public Head addBrain() {
		internals.add(new Brain());
		return this;
	}

}
