package game.characters;

import javax.swing.ImageIcon;

public class Player extends Character{
   

	
	public Player(int start_x, int start_y, ImageIcon imageIcon) {
		super(start_x, start_y, imageIcon);
	}
	
	@Override
	public void move(int movement) {
		int x = getX();
		if(x != 0 && movement < 0) {
			setX(x + movement);
		} else if (x != 736 && movement > 0) {
			setX(x + movement);
		}
	}
}
