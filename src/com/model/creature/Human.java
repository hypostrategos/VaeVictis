package com.model.creature;

import com.model.creature.body.*;

public class Human extends Creature {
	
	public Human(int xLoc, int yLoc) {
		super(xLoc, yLoc);
		frame = new Frame();
		frame.addHead()
			.addBrain();
		frame.addTorsoSegment()
			.addLeg().addLeg();
		frame.addTorsoSegment()
			.addArm().addArm();
	}

}
