package game.characters;


import javax.swing.ImageIcon;

public class Alien extends Character {
	
	private boolean endOfLeftScreen = false;
	private boolean endOfRightScreen = false;
	//private int leftScreenBoundry = 0;
	//private int rightScreenBoundry = 736;


	//size of image is 64x64
	
	public Alien(int start_x, int start_y, ImageIcon imageIcon) {
		super(start_x, start_y, imageIcon);
	}

	@Override
	public void move(int movement) {
		
		int x = getX();
		int y = getY();
		
		if(!endOfLeftScreen && !endOfRightScreen) {
			x = x - movement;
			if(x == 0) {
				endOfLeftScreen = true;
			}
		} else if(endOfLeftScreen && !endOfRightScreen) {
			if(y>=50) {
				x = x + (movement * 2);
			} else {
				x = x + movement;
			}
			if(x >= 736) {
				endOfRightScreen = true;
				endOfLeftScreen = false;
				y = y + 10;
			}
		} else if(!endOfLeftScreen && endOfRightScreen) {
			if(y>=50){
				x = x - (movement*2);
			} else {
				x = x - movement;
			}
			if(x <= 0) {
				endOfRightScreen = false;
				endOfLeftScreen = true;
				y = y + 10;
			}
		}
		
		setX(x);
		setY(y);
	}
	
	public void move2(int movement, int leftScreenBoundry, int rightScreenBoundry) {
		int x = getX();
		int y = getY();
		
		if(!endOfLeftScreen && !endOfRightScreen) {
			x = x - movement;
			if(x <= leftScreenBoundry) {
				endOfLeftScreen = true;
			}
		} else if(endOfLeftScreen && !endOfRightScreen) {
			x = x + movement;
			
			if(x >= rightScreenBoundry) {
				endOfRightScreen = true;
				endOfLeftScreen = false;
				y = y + 10;
			}
		} else if(!endOfLeftScreen && endOfRightScreen) {
			x = x - movement;
			if(x <= leftScreenBoundry) {
				endOfRightScreen = false;
				endOfLeftScreen = true;
				y = y + 10;
			}
		}
		
		setX(x);
		setY(y);
	}

}
