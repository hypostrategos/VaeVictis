package com.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.controller.player.Player;
import com.main.Storage;
import com.model.world.World;

public class Display {
	public static final int xWidth = 1200;
	public static final int yWidth = 800;
	
	public static void start() {
		JFrame jf = new JFrame("Survival Game");
	    jf.setSize(xWidth+50,yWidth+50);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    jf.addKeyListener(new keyEvent());
	    jf.setVisible(true);
	}
}

class keyEvent implements KeyListener {
	
	public keyEvent () {
	}
	
	public void keyPressed(KeyEvent k) {
//		 System.out.println(k.getKeyCode());
		switch(k.getKeyCode()) {
			 case 84 : World.instance.addRegion(); //t key
			 break;
			 case 85 : World.instance.worldUpdate(1); // u key
			 break;
			 case 73 : World.instance.worldUpdate(100); //i key
			 break;
			 case 83 : Storage.save("NewSave.sav"); //s
			 break;
			 case 76 : Storage.load("NewSave.sav");  //l
			 break;
			 case 68 : System.out.println("----Regions: "+World.instance.regions.size()
			 +"	Time: "+World.instance.currTime+"\n"+World.instance);
			 break;
			// case 88 : map.mapIncreaseSpecies(1); //z key
			// break;
//			 case 90: map.mapIncreaseSpecies(2); //x key
//			 break;
			 case 104 : Player.instance.move(0,-1);
			 break;
			 case 102 : Player.instance.move(1,0); 
			 break;
			 case 98 : Player.instance.move(0,1);
			 break;
			 case 100 : Player.instance.move(-1,0);
			 break;
			 
			 
			case 27 : System.exit(0); //esc key
			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}