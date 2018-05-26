package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.model.world.World;

public class Main {	
	private static World world;
	public static void main(String[] args) {
		world = World.getInstance();
		world.worldUpdate(100);
		save("NewSave.sav");
		load("NewSave.sav");
		System.out.println(world.creatures);
		System.out.println(world.currTime);
	}
	
	public static void load(String saveName) {
		try {
			ObjectInputStream save = new ObjectInputStream(new FileInputStream(saveName));
			world = (World) save.readObject();
			save.close();
		} catch (Exception e) {
			e.printStackTrace();
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
