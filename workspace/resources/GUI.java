package resources;
import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Stack;


public class GUI extends JFrame implements ActionListener, MouseListener, MouseMotionListener{

	Solitaire game;
   public GUI(Solitaire game){
	   this.game= game;
        //Create and set up the window.
       setTitle("Solitaire");
       setSize(900,700);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       // this supplies the background
       try {
		System.out.println(getClass().toString());
		Image blackImg = ImageIO.read(getClass().getResource("background.jpg"));
		setContentPane(new ImagePanel(blackImg));

       }catch(IOException e) {
    	   e.printStackTrace();
       }
       
       /*******
        * This is just a test to make sure images are being read correctly on your machine. Please replace
        * once you have confirmed that the card shows up properly. The code below should allow you to play the solitare
        * game once it's fully created.
        */
       Card card = new Card(2, Card.Suit.Diamonds);
       System.out.println(card);
	   JPanel foundation=new JPanel(new GridLayout());
	   JPanel tableau=new JPanel(new GridLayout());
	   JPanel deck =new JPanel(new GridLayout());
	   foundation.setBounds(00,000,400,200);
	   deck.setBounds(500,000,400,200);
	   tableau.setBounds(00,200,1000,800);
	   Stack <Card> testStack=new Stack();

		testStack.add(new Card(3, Card.Suit.Diamonds));
		testStack.add(new Card(4, Card.Suit.Diamonds));
		testStack.add(new Card(5, Card.Suit.Clubs));
		testStack.add(new Card(8, Card.Suit.Diamonds));
		testStack.add(new Card(7, Card.Suit.Clubs));
	   tableau.add(drawPile(testStack));
       this.add(card);    
	   this.add(deck);
	   
	   this.add(foundation);
	   this.add(tableau);
	   foundation.setBorder(BorderFactory.createLineBorder(Color.red));
	   
	   tableau.setBorder(BorderFactory.createLineBorder(Color.red));
	   deck.setBorder(BorderFactory.createLineBorder(Color.red));


        this.setVisible(true);
    }


	public JLayeredPane drawPile(Stack<Card> stackIn) {

    Object cards[];

    cards = stackIn.toArray(); //please note we convert this stack to an array so that we can iterate through it backwards while drawing. You’ll need to cast each element inside cards to a <Card> in order to use the methods to adjust their position
	
	JLayeredPane pile=new JLayeredPane();

	for (int i = 0; i < cards.length; i++) {
		JPanel card = (Card) cards[i];
		card.setBounds(0, 400-100*i,100, 145);
		pile.add(card, i);
	}
	return pile;
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
