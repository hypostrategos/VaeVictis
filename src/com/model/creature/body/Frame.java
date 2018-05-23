package com.model.creature.body;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Frame implements java.io.Serializable{
	private Head head;
	private List<TorsoSegment> torsoSegments = new ArrayList<>();

	public Head addHead() {
		head = new Head();
		return head;
	}
	public TorsoSegment addTorsoSegment() {
		TorsoSegment torsoSegment = new TorsoSegment();
		torsoSegments.add(torsoSegment);
		return torsoSegment;
	}
	
	@Override
	public String toString() {
		return Arrays.toString(torsoSegments.toArray());
	}
}
