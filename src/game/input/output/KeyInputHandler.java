package game.input.output;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class KeyInputHandler extends KeyAdapter{
	protected boolean leftPressed = false;
	protected boolean rightPressed = false;
	
	
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			leftPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rightPressed = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			//firePressed = true;
		}
	} 

	public void keyReleased(KeyEvent e) {
		// if we're waiting for an "any key" typed then we don't 
		// want to do anything with just a "released"

		
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			leftPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			rightPressed = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE) {
			//firePressed = false;
		}
	}
	
	public boolean isLeftPressed() {
		return leftPressed;
	}

	public void setLeftPressed(boolean leftPressed) {
		this.leftPressed = leftPressed;
	}

	public boolean isRightPressed() {
		return rightPressed;
	}

	public void setRightPressed(boolean rightPressed) {
		this.rightPressed = rightPressed;
	}

}
