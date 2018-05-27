package com.model.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.model.creature.Creature;
import com.model.creature.Human;

public class Region implements java.io.Serializable {

	final int xMax = 100;
	final int yMax = 100;
	int tiles[][] = new int[xMax][yMax];
	String overview;
	
	public List<Creature> creatures = new ArrayList<>();
			
	Region() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		int val;		
		for (int j=0;j<yMax;j++) {
			for (int i=0;i<xMax;i++) {
//				val = rand.nextInt(5);
				val = 1;
				switch(val) {
					case 1: creatures.add(new Human(i,j));
					break;
				}
				tiles[i][j] = val;
				sb.append(val);
			}
			sb.append("\n");
		}
		overview = sb.toString();
	}
	
	@Override
	public String toString() {
		return "\n"+overview;
	}
}
