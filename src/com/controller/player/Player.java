package com.controller.player;

import com.model.creature.Creature;

public class Player extends Creature{
	public static Player instance;
	public int icon=9;

	public Player(int xLoc, int yLoc) {
		super(xLoc, yLoc);
//		System.out.println("Player Created");
		// TODO Auto-generated constructor stub
	}
	
	public void move(int xDisp, int yDisp) {
		super.move(xDisp, yDisp);
		currRegion.tiles[xLoc][yLoc]=icon;
		System.out.println(getPos());
	}

	
	public String getPos() {
		return "X: "+xLoc+" Y: "+yLoc;
	}

}
