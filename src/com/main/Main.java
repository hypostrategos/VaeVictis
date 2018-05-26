package com.main;

import com.model.world.World;
import com.view.Display;

public class Main {	
	public static void main(String[] args) {
		World.setWorld();
		Display.start();
	}
}