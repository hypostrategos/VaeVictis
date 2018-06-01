package com.main;

import com.view.Display;

public class Main {	
	public static void main(String[] args) {
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Display.createAndShowGUI();
            }
        });
	}
}