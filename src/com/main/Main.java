package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.creature.Human;
import com.model.world.World;

public class Main {	
	private static World world;
	public static void main(String[] args) {
		 load("null");
		 save("NewSave.sav");
//		 load("NewSave.sav");
		 System.out.println(world.creatures);
	}
	
	public static void load(String saveName) {
		if (saveName.equals("null")) {
			world = new World();
		} else {
			try {
				ObjectInputStream save = new ObjectInputStream(new FileInputStream(saveName));
				world = (World) save.readObject();
				save.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void save(String saveName) {
		try {
			ObjectOutputStream save = new ObjectOutputStream(new FileOutputStream(saveName));
			save.writeObject(world);
			save.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
