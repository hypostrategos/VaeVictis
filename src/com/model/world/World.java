package com.model.world;

import java.util.ArrayList;
import java.util.List;

import com.model.creature.Creature;
import com.model.creature.Human;

public class World implements java.io.Serializable  {
	private static final long serialVersionUID = 1L;
	
	public List<Creature> creatures = new ArrayList<>();
			
	public World() {
		creatures.add(new Human());
		creatures.add(new Human());
	}
	
}
