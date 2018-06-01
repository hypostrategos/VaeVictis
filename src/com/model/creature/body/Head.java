package com.model.creature.body;

import java.util.ArrayList;
import java.util.List;

import com.model.creature.body.internal.Internal;

public class Head extends Part {
	
	List<Internal> internals = new ArrayList<>();
	
	public Head addInternal(Internal internal) {
		internals.add(internal);
		return this;
	}

}
