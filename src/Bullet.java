import java.awt.Image;

import javax.swing.ImageIcon;

public class Bullet {
	
	public int bulletAmount=5;
	public Image image;
	
	public Bullet(String s) {
		  this((new ImageIcon(s)).getImage());
	}
	public Bullet(Image r) {
		image = r;
	}
	
	
	
	public int getBulletAmount() {
		return bulletAmount;
	}
	public int bulletFired() {
		bulletAmount--;
		return bulletAmount;
	}
	
	public void reload() {
		bulletAmount = 5;
	}
	
}
