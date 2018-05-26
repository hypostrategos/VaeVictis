package com.model.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.model.creature.Creature;
import com.model.creature.Human;

public class World implements java.io.Serializable  {
	private static World instance;
	
	public double currTime;
	
	final int xMax = 100;
	final int yMax = 100;
	int tiles[][] = new int[xMax][yMax];
	
	public List<Creature> creatures = new ArrayList<>();
			
	private World() {
		Random rand = new Random();
		int val;
		for (int j=0;j<yMax;j++) {
			for (int i=0;i<yMax;i++) {
				val = rand.nextInt(5);
				switch(val) {
					case 1: creatures.add(new Human(i,j));
					break;
				}
				tiles[i][j] = val;
				System.out.print(val);
			}
			System.out.println();
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
//		creatures.get(creatures.size()-1).move(10,10);
	}
	
	@Override
	public String toString() {
		return Arrays.deepToString(tiles);
	}

}
