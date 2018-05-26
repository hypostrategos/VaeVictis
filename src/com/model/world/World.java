package com.model.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class World implements java.io.Serializable  {
	public double currTime;
	
	public List<Region> regions = new ArrayList<>();
	public Region currRegion;

	public static World instance = new World();
					
	public World() {
		currRegion = new Region();
		regions.add(currRegion);
	}
	
	public Region getCurrRegion() {
		return currRegion;
	}
	
	public void addRegion() {
		regions.add(new Region());
	}
			
	public void worldUpdate(double addTime) {
		currTime+=addTime;
		System.out.println(currTime);
//		creatures.get(creatures.size()-1).move(10,10);
	}
	
	@Override
	public String toString() {
		return Arrays.toString(regions.toArray());
	}
	
}
