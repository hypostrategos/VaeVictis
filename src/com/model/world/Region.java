package com.model.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.controller.player.Player;
import com.model.creature.*;

public class Region implements java.io.Serializable {

	Random rand = new Random();
	public final static int xMax = 10;
	public final static int yMax = 10;
	public int tiles[][] = new int[xMax][yMax];
	String overview;
	
	public List<Creature> creatures = new ArrayList<>();
			
	public Region() {
		StringBuilder sb = new StringBuilder();
		int tileValue;
		for (int j=0;j<yMax;j++) {
			for (int i=0;i<xMax;i++) {
				tileValue = spawn(i,j);
				tiles[i][j] = tileValue;
			}
		}
	}
	
	public void overviewGen() {
		StringBuilder sb = new StringBuilder();
		for (int j=0;j<Region.yMax;j++) {
			for (int i=0;i<Region.xMax;i++) {			
				sb.append(tiles[i][j]);
			}
			sb.append("\n");
		}
		overview=sb.toString();
	}

	
	private int spawn(int i, int j) {
		if (i==0&&j==0) {
			return 9;
		}
		int tileValue = rand.nextInt(5);
		switch(tileValue) {
			case 1: creatureSpawn(i,j);
					return tileValue;
//			break;
		}	
//		return tileValue;
		return 0;
	}
	
	private void creatureSpawn(int i, int j) {
		switch( rand.nextInt(4) ) {
			case 0: creatures.add(new Human(i,j,this));
			break;
			case 1: creatures.add(new Dog(i,j,this));
			break;
			case 2: creatures.add(new Elf(i,j,this));
			break;
			case 3: creatures.add(new Snake(i,j,this));
			break;
		}
	}
	
	public Creature getCreatureAt(int x, int y) {
		for (Creature creature : creatures) {
			if (creature.xLoc==x&&creature.yLoc==y) {
				return creature;
			}
		}
		return null;
	}
	
	@Override
	public String toString() {
		overviewGen();
		return "\n"+overview;
	}
}
