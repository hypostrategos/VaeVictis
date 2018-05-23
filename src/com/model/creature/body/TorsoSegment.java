package com.model.creature.body;

import java.util.ArrayList;
import java.util.List;

public class TorsoSegment implements java.io.Serializable {
	
	List<Limb> limbs = new ArrayList<>();
	List<Internal> internals = new ArrayList<>();

	public void addLimb(Limb limb) {
		limbs.add(limb);
	}
	public void addInternal(Limb internal) {
		limbs.add(internal);
	}
	
	public TorsoSegment addLeg() {
		limbs.add(new Leg());
		return this;
	}
	public TorsoSegment addArm() {
		limbs.add(new Arm());
		return this;
	}

}
