package com.model.creature.body;

import java.util.ArrayList;
import java.util.List;

import com.model.creature.body.internal.Internal;
//import com.model.creature.body.limb.Arm;
//import com.model.creature.body.limb.Leg;
import com.model.creature.body.limb.Limb;

public class TorsoSegment implements java.io.Serializable {
	
	List<Limb> limbs = new ArrayList<>();
	List<Internal> internals = new ArrayList<>();

	public TorsoSegment addLimb(Limb limb) {
		limbs.add(limb);
		return this;
	}
	public TorsoSegment addInternal(Internal internal) {
		internals.add(internal);
		return this;
	}
}
