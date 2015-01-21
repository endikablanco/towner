import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.swing.JLabel;


public class Tile extends JLabel{



	private BufferedImage image;
	private boolean blocked;

	public Tile(BufferedImage backimage, boolean blocked){
		this.image = backimage;
		this.blocked = blocked;	
	}


	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}


	public BufferedImage getImage() {
		return image;
	}

	public boolean isBlocked() {
		return blocked;
	}

}


