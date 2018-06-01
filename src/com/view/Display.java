package com.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Display extends JPanel implements ActionListener {	
//	public static String currInput="";
    protected JTextField textField;
    protected static JTextArea textArea;
    private final static String newline = "\n";
 
    public Display() {
        super(new GridBagLayout());
 
        textField = new JTextField(40);
        textField.addActionListener(this);
 
        textArea = new JTextArea(20, 40);
        textArea.setEditable(false);
        textArea.addKeyListener(new MapKeyEvent());
        JScrollPane scrollPane = new JScrollPane(textArea);
 
        GridBagConstraints c = new GridBagConstraints();
        c.gridwidth = GridBagConstraints.REMAINDER;
 
        c.fill = GridBagConstraints.HORIZONTAL;
        add(textField, c);
 
        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.weighty = 1.0;
        add(scrollPane, c);
    }
 
    public void actionPerformed(ActionEvent evt) {
//        String text = textField.getText();
//        textArea.append(text + newline);
//        textField.selectAll();
// 
//        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
    
    public static void update(String update) {
    	textArea.setText(update);
        textArea.setCaretPosition(textArea.getDocument().getLength());
    }
	
	public static void createAndShowGUI() {
		JFrame jf = new JFrame("Vae Victis");
	    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jf.add(new Display());
        
        jf.pack();
        jf.setVisible(true);
	    
	}
}