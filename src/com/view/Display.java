package com.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import com.main.Storage;
import com.model.world.World;

public class Display {
	public static final int xWidth = 1200;
	public static final int yWidth = 800;
	
	public static void start() {
		JFrame jf = new JFrame("Vae Victis");
	    jf.setSize(xWidth+50,yWidth+50);
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	    jf.addKeyListener(new keyEvent());
	    jf.setVisible(true);

	}
}

enum Context {
	MOVE, ATTACK, CREATURE_MOVE;
	public Context getNext() {
		return values()[(ordinal()+1)%values().length];
	}
}
class keyEvent implements KeyListener {
	World world;
	Context ctx = Context.MOVE;
	
	public keyEvent () {
	}
	
	public void keyPressed(KeyEvent k) {
//		 System.out.println(k.getKeyCode());
		switch(k.getKeyCode()) {
			 case 84 : world.addRegion(); //t key
			 break;
			 case 85 : world.worldUpdate(1); // u key
			 break;
			 case 73 : world.worldUpdate(100); //i key
			 break;
			 case 83 : Storage.save("NewSave.sav", world); //s
			 break;
			 case 76 : world = Storage.load("NewSave.sav");  //l
			 break;
			 case 68 : System.out.println("----Regions: "+world.regions.size()
			 +"	Time: "+world.currTime+"\n"+world);
			 break;
			 case 78 : world = new World(); System.out.println("New Game"); //n key
			 break;
//			 case 90: map.mapIncreaseSpecies(2); //x key
//			 break;
			 case 67: ctx = ctx.getNext();
			 System.out.println(ctx);
			 break;
			 case 104 : setInput(0,-1);
			 break;
			 case 102 : setInput(1,0);
			 break;
			 case 98 : setInput(0, 1);
			 break;
			 case 100 : setInput(-1, 0);
			 break;

			case 27 : System.exit(0); //esc key
			break;
		}
	}
	
	private void setInput(int x, int y) {
		switch (ctx) {
			case MOVE: world.player.move(x, y);
			break;
			case ATTACK: world.player.attack(x, y);
			break;
			case CREATURE_MOVE: world.player.currRegion.creatures.get(1).move(x ,y);
			break;
		}
		ctx=Context.MOVE;
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