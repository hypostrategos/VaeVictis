package com.model.creature;

import com.model.creature.body.limb.*;
import com.model.world.Region;
import com.model.creature.body.Frame;
import com.model.creature.body.internal.*;

public class Snake extends Creature {
	
	public Snake(int xLoc, int yLoc, Region currRegion) {
		super(xLoc, yLoc, currRegion);
		baseSpeed=50;
		speed=baseSpeed;
		frame = new Frame();
		frame.addHead()
			.addInternal(new Brain()).addInternal(new Mouth()).addInternal(new Eyes());
		frame.addTorsoSegment()
			.addLimb(new Tail()).addInternal(new Intestines());
		frame.addTorsoSegment()
			.addInternal(new Heart()).addInternal(new Stomach());
	}
}
