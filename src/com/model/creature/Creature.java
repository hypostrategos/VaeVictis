package com.model.creature;

import com.model.creature.body.Frame;
import com.model.world.Region;

public class Creature implements java.io.Serializable {
	public Region currRegion;

	public int icon=1;
	public int xLoc;
	public int yLoc;
	Frame frame;
	
	public Creature(int xLoc, int yLoc, Region currRegion) {
		this.xLoc = xLoc;
		this.yLoc = yLoc;
		this.currRegion = currRegion;
		System.out.println("Creature created "+xLoc+" "+yLoc);
	}
	
	public void move(int xDisp, int yDisp) {
		int xFut=xLoc+xDisp;
		int yFut=yLoc+yDisp;
		if ((xFut>=0 && xFut<Region.xMax
				&& yFut>=0 && yFut<Region.yMax) 
			&& (currRegion.tiles[xFut][yFut]==0))
		{
			currRegion.tiles[xLoc][yLoc]=0;
			xLoc=xFut;
			yLoc=yFut;
			currRegion.tiles[xLoc][yLoc]=icon;
		} else {
			System.out.println("Can't move there");
		}
	}
	
	@Override
	public String toString() {
		return frame+" xLoc:"+xLoc+" yLoc:"+yLoc+"\n";
	}

}
