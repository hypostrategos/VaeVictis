package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.world.World;

public class Storage {	
	public static void load(String saveName) {
		try {
			ObjectInputStream save = new ObjectInputStream(new FileInputStream(saveName));
			World.instance = (World) save.readObject();
			save.close();
			System.out.println(saveName+" Loaded");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void save(String saveName) {
		try {
			ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(saveName));
			save.writeObject(World.instance);
			save.close();
			System.out.println(saveName+" Saved");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
