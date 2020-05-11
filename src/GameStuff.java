import java.awt.Color;
import java.awt.Container;
/*import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;*/
/*import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;*/

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameStuff extends JPanel {
	
	   
	public GameStuff() {
	
	}
	
	   
	
	
	
	public static void main(String[] args) 
	{
		JFrame w = new JFrame("SpaceGame");
		
	    w.setBounds(100, 100, 640, 480);
	    w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  SpaceShip	players = new SpaceShip("thespaceship.jpg","TheLeftShip.jpg",0,0, 580, 400);
	
	players.setBackground(Color.BLACK);
//	    SpaceShipOrg player1 = new SpaceShipOrg("thespaceship.jpg",0,0);
//	    SpaceShipOrg player2 = new SpaceShipOrg("TheLeftShip.jpg", 50, 50);
//	    player1.setBackground(Color.WHITE);
//	player2.setBackground(Color.WHITE);
	  
	  
	    Container c = w.getContentPane();
	c.add(players);
	//c.add(player1);
	
//	c.add(player2);
	
	
	
	 
	    w.setResizable(false);
	    w.setVisible(true);
	  
	}
}


