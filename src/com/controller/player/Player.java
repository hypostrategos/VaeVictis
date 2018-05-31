package com.controller.player;

import com.model.creature.Creature;
import com.model.world.Region;

public class Player extends Creature{

	public Player(int xLoc, int yLoc, Region currRegion) {
		super(xLoc, yLoc, currRegion);
//		System.out.println("Player Created");
	}
	
	public Player(Region currRegion) {
		super(0,0, currRegion);
	}
	
	public void move(int xDisp, int yDisp) {
		super.move(xDisp, yDisp);
		System.out.println(getPos());
	}
	
	@Override
	public int getIcon() {
		return 9;
	}

	
	public String getPos() {
		return "X: "+xLoc+" Y: "+yLoc;
	}

}
