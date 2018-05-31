package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.world.World;

public class Storage {	
	public static World load(String saveName) {
		World world=null;
		try {
			ObjectInputStream save = new ObjectInputStream(new FileInputStream(saveName));
			world = (World) save.readObject();
			save.close();
			System.out.println(saveName+" Loaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return world;
	}
	public static void save(String saveName, World world) {
		try {
			ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(saveName));
			save.writeObject(world);
			save.close();
			System.out.println(saveName+" Saved");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
