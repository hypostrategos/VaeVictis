package com.model.world;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.model.creature.Creature;
import com.model.creature.Human;

public class Region implements java.io.Serializable {

	final int xMax = 10;
	final int yMax = 10;
	int tiles[][] = new int[xMax][yMax];
	String overview;
	
	public List<Creature> creatures = new ArrayList<>();
			
	Region() {
		Random rand = new Random();
		StringBuilder sb = new StringBuilder();
		int val;
		for (int j=0;j<yMax;j++) {
			for (int i=0;i<yMax;i++) {
				val = rand.nextInt(5);
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
