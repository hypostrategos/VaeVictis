package com.model.world;

import com.model.creature.Human;

public class World implements java.io.Serializable  {
	private static final long serialVersionUID = 1L;
	
	Human human = new Human();
			
	public World() {
		System.out.println(human);
	}
	
}
