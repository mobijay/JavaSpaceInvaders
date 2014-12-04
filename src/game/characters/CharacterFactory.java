package game.characters;

import javax.swing.ImageIcon;

public class CharacterFactory {
	
	private static final String squidImage = "../../images/squid.png";
	private static final String crabImage = "../../images/crab.png";
	private static final String playerImage = "../../images/space_fighter.png";
	
	public static Character getAlien(SpaceInvaderEnum characterToCreate, int start_x, int start_y) {
		
		switch(characterToCreate) {
		case SQUID:
			return new Alien(start_x, start_y, new ImageIcon(CharacterFactory.class.getClass().getResource(squidImage)));
		case CRAB:
			return new Alien(start_x, start_y, new ImageIcon(CharacterFactory.class.getClass().getResource(crabImage)));
		default:
			break;
		}
		return null;
	}
	
	public static Character getPlayer(int start_x, int start_y) {
		return new Player(start_x, start_y, new ImageIcon(CharacterFactory.class.getClass().getResource(playerImage)));
	}
}
