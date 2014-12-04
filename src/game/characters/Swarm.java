package game.characters;

public class Swarm {

	private final Position alienSwarm[][] = new Position[2][2];
	
	public void setAlien(int xMatirx, int yMatrix, Position position) {
		alienSwarm[xMatirx][yMatrix] = position;
	}
}
