package com.model.creature;

import com.model.creature.body.*;

public class Human implements Creature {

	Frame frame = new Frame();
	
	public Human() {
		frame.addHead()
			.addBrain();
		frame.addTorsoSegment()
			.addLeg().addLeg();
		frame.addTorsoSegment()
			.addArm().addArm();
	}
	
	@Override
	public String toString() {
		return frame+"";
	}

}
