package com.model.world;

import java.util.ArrayList;
import java.util.List;

import com.model.creature.Creature;
import com.model.creature.Human;

public class World implements java.io.Serializable  {
	private static World instance;
	
	public static double currTime;
	
	int xMax = 10;
	int yMax = 10;
	
	public List<Creature> creatures = new ArrayList<>();
			
	private World() {
		for (int i=0;i<xMax;i++) {
			for (int j=1;j<yMax;j++) {
				creatures.add(new Human(i,j));
			}
		}
	}
	
	public static World getInstance() {
		if (instance==null) {
			instance = new World();
		}
		return instance;
	}
	
	public void worldUpdate(double addTime) {
		currTime+=addTime;
	}
	
}
