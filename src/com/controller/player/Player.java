package com.controller.player;

import com.model.creature.Creature;
import com.model.creature.body.Frame;
import com.model.creature.body.internal.Brain;
import com.model.creature.body.internal.Eyes;
import com.model.creature.body.internal.Heart;
import com.model.creature.body.internal.Intestines;
import com.model.creature.body.internal.Mouth;
import com.model.creature.body.internal.Stomach;
import com.model.creature.body.limb.Arm;
import com.model.creature.body.limb.Leg;
import com.model.world.Region;

public class Player extends Creature{

	public Player(int xLoc, int yLoc, Region currRegion) {
		super(xLoc, yLoc, currRegion);
		frame = new Frame();
		frame.addHead()
			.addInternal(new Brain()).addInternal(new Mouth()).addInternal(new Eyes());
		frame.addTorsoSegment()
			.addLimb(new Leg()).addLimb(new Leg()).addInternal(new Intestines());
		frame.addTorsoSegment()
			.addLimb(new Arm()).addLimb(new Arm()).addInternal(new Heart()).addInternal(new Stomach());
//		System.out.println("Player Created "+this);
	}
	
	public Player(Region currRegion) {
		this(0,0, currRegion);
	}
	
//	public void move(int xDisp, int yDisp) {
//		super.move(xDisp, yDisp);
//		System.out.println(getPos());
//	}
	
	@Override
	public int getIcon() {
		return 9;
	}

	public String getPos() {
		return "X: "+xLoc+" Y: "+yLoc;
	}

}
