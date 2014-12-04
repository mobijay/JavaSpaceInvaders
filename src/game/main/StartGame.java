package game.main;

import game.space.invaders.SpaceInvaders;

public class StartGame {
	
	/**
	 * The entry point into the game. We'll simply create an
	 * instance of class which will start the display and game
	 * loop.
	 * 
	 * @param argv The arguments that are passed into our game
	 */
	public static void main(String argv[]) {
		SpaceInvaders si = new SpaceInvaders("Space Invaders");
		si.gameLoop();
	}
}

