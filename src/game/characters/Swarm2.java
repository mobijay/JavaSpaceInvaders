package game.characters;

import game.space.invaders.SpaceInvaders;

import java.awt.Graphics;

public class Swarm2 {
	private final Alien[][] alienSwarm = new Alien[2][3];
	
	//Set the aliens in the array
	public void setAlien(int xMatirx, int yMatrix, Alien alien) {
		alienSwarm[xMatirx][yMatrix] = alien;
	}
	
	//Draw each alien in the swarm
	public void drawAliensInSwarm(Graphics g, SpaceInvaders gameScreen) {
		int rows = 2;
		int columns = 3;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				alienSwarm[i][j].draw(g, gameScreen);
			}
		}
	}
	
	public void moveAliensInTheSwarm() {
		alienSwarm[0][0].move2(1, 0, 608);
		alienSwarm[0][1].move2(1, 64, 672);
		alienSwarm[0][2].move2(1, 128, 736);
		alienSwarm[1][0].move2(1, 0, 608);
		alienSwarm[1][1].move2(1, 64, 672);
		alienSwarm[1][2].move2(1, 128, 736);
	}
}
