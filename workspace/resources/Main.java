package resources;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Main {

	public static void main(String[] args) {

		Solitaire game= new Solitaire();
		GUI gui = new GUI(game);
		//game.initialize();
		gui.update();
	
			
		
	}

	

 
}