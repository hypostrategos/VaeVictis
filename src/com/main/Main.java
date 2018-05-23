package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.world.World;

public class Main {	
	private static World world;
	public static void main(String[] args) {
		 start("null");
		 world.test="test new";
		 save("NewSave.sav");
		 start("NewSave.sav");
	}
	
	public static void start(String saveName) {
		if (saveName.equals("null")) {
			world = new World();
		} else {
			try {
				FileInputStream saveFile = new FileInputStream(saveName);
				ObjectInputStream save = new ObjectInputStream(saveFile);
				world = (World) save.readObject();
				save.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void save(String saveName) {
		try {
			FileOutputStream saveFile = new FileOutputStream(saveName);
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			save.writeObject(world);
			save.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
