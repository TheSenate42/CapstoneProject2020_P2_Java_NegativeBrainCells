import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
//import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
//import java.awt.image.ImageObserver;


import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class SpaceShip extends JPanel implements ActionListener, KeyListener
{
	Timer timer = new javax.swing.Timer(5,this);
	int VelocityX = 2;
	
 int x ;
 int y ;
 int x1;
 int y1;
 int bulletX;
 int bulletY;
 int bulletX1;
 int bulletY1;
  private Image pic2;
  private Image pic;
  public Bullet bullet;
 public Boolean shot1 = false;
 public Boolean shot2 = false;

public SpaceShip (String l, String r,int f , int g,int p, int q) 
  {
	 
	  this((new ImageIcon(l)).getImage(), new ImageIcon(r).getImage(),  f,  g, p,  q);
	  addKeyListener(this);
	  setFocusable(true);
	  setFocusTraversalKeysEnabled(false);
	 bullet = new Bullet("Bullet.png");
  }
public SpaceShip(Image p, Image r, int l, int q,int f, int g ) {
	pic = p;
	pic2 = r;
	x = l;
	y = q;
	x1 = f;
	y1 = g;
}
public void paintComponent(Graphics g) {
	super.paintComponent(g);
	Graphics2D g1 = (Graphics2D)g;
	//Graphics2D g2 = (Graphics2D)g;
	g1.drawImage(pic,x,y,this);
	g1.drawImage(pic2,x1,y1,this);
	if(bullet.bulletAmount == 0) {
		bullet.reload();
	}
	else if(shot1 == true) {
		timer.start();
		bullet.bulletFired();
		g.drawImage(bullet.image, bulletX, bulletY +25,null);
	}
	else if(shot2 == true) {
		timer.start();
		bullet.bulletFired();
		g.drawImage(bullet.image, bulletX1+50, bulletY1 +25,null);
	}
	repaint();
	}
public void keyPressed(KeyEvent pressedkey) {
	// TODO Auto-generated method stub
	int x  =pressedkey.getKeyCode();
	
	
	if( x == KeyEvent.VK_UP) {
		
		if(this.y>0) {
			this.y -=10;
		}
	}
	else if(x == KeyEvent.VK_DOWN) {
		if(this.y<400)
		this.y +=10;
		
	}
	else if(x == KeyEvent.VK_LEFT) {
		if(this.x>0)
		this.x -=10;
	}
	else if(x == KeyEvent.VK_RIGHT) {
		if(this.x<260)
		this.x +=10;
	}
	
	else if(x == KeyEvent.VK_CONTROL) {
		if(bullet.getBulletAmount()>0)
			this.shoot2();
	}
	else if(x == KeyEvent.VK_W) {
		if(this.y1>0)
		this.y1 -=10;
	}
	else if(x == KeyEvent.VK_S) {
		if(this.y1<400)
		this.y1 +=10;
	}
	else if(x == KeyEvent.VK_A) {
		if(this.x1>320)
		this.x1 -=10;
	}
	else if(x == KeyEvent.VK_D) {
		if(this.x1<580)
		this.x1 +=10;
	}
	else if(x == KeyEvent.VK_SHIFT) {
		if(bullet.getBulletAmount()>0) {
		this.shoot1();
		}
	}
	
	  repaint();
}

@Override
public void keyReleased(KeyEvent releasedkey) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyTyped(KeyEvent arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	bulletX -= VelocityX;
	bulletX1 += VelocityX;
	
	repaint();
	
	
}
public void shoot1() {
	shot1 = true;
	bulletX = this.x1;
	bulletY = this.y1;
	
}
public void shoot2() {
	shot2 = true;
	bulletX1 = this.x;
	bulletY1 = this.y;
	
}
  




 
}

