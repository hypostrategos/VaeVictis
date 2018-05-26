package com.model.creature;

import com.model.creature.body.*;

public class Human extends Creature {
	
	public Human() {
		frame = new Frame();
		frame.addHead()
			.addBrain();
		frame.addTorsoSegment()
			.addLeg().addLeg();
		frame.addTorsoSegment()
			.addArm().addArm();
	}
	public Human(int xLoc, int yLoc) {
		this();
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	@Override
	public String toString() {
		return frame+" xLoc:"+xLoc+" yLoc:"+yLoc+"\n";
	}

}
