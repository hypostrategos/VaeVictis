package com.model.creature;

import com.model.creature.body.Frame;

public class Creature implements java.io.Serializable {

	int xLoc;
	int yLoc;
	Frame frame;
	
	public Creature(int xLoc, int yLoc) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	public void move(int xDisp, int yDisp) {
		xLoc+=xDisp;
		yLoc+=yDisp;
	}

	@Override
	public String toString() {
		return frame+" xLoc:"+xLoc+" yLoc:"+yLoc+"\n";
	}

}
