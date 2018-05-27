package com.model.creature;

import com.model.creature.body.limb.*;
import com.model.creature.body.Frame;
import com.model.creature.body.internal.*;

public class Dog extends Creature {
	
	public Dog(int xLoc, int yLoc) {
		super(xLoc, yLoc);
		frame = new Frame();
		frame.addHead()
			.addInternal(new Brain()).addInternal(new Mouth()).addInternal(new Eyes());
		frame.addTorsoSegment()
			.addLimb(new Leg()).addLimb(new Leg()).addInternal(new Intestines());
		frame.addTorsoSegment()
			.addLimb(new Leg()).addLimb(new Leg()).addInternal(new Heart()).addInternal(new Stomach());
	}
}