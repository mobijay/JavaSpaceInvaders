package game.characters;


import game.space.invaders.SpaceInvaders;

import java.awt.Graphics;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public abstract class Character implements ICharacter{
	private boolean visible;
	private final ImageIcon imageIcon;
	private int x;
	private int y;
	protected boolean dying;
	//private Rectangle currentPosition;

	
	public Character(int x, int y, ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
		this.x = x;
		this.y = y;
		visible = true;
	}
	
	@Override
	public void draw(Graphics g, SpaceInvaders gameScreen) {
       if (this.isVisible()) {
            g.drawImage(this.getImageIcon().getImage(), this.getX(), this.getY(), gameScreen);
        }

        if (this.isDying()) {
        	this.setVisible(false);
        }
	}
	
	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isDying() {
		return dying;
	}

	public void setDying(boolean dying) {
		this.dying = dying;
	}

	public ImageIcon getImageIcon() {
		return imageIcon;
	}
}
