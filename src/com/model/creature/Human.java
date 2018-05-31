package com.model.creature;

import com.model.creature.body.limb.*;
import com.model.world.Region;
import com.model.creature.body.Frame;
import com.model.creature.body.internal.*;

public class Human extends Creature {
	
	public Human(int xLoc, int yLoc, Region currRegion) {
		super(xLoc, yLoc, currRegion);
		frame = new Frame();
		frame.addHead()
			.addInternal(new Brain()).addInternal(new Mouth()).addInternal(new Eyes());
		frame.addTorsoSegment()
			.addLimb(new Leg()).addLimb(new Leg()).addInternal(new Intestines());
		frame.addTorsoSegment()
			.addLimb(new Arm()).addLimb(new Arm()).addInternal(new Heart()).addInternal(new Stomach());
	}
	//19444 vs 26281 @ 1000x100 region

}
