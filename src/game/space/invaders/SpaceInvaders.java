package game.space.invaders;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import game.board.Board;
import game.characters.Alien;
import game.characters.CharacterFactory;
import game.characters.ICharacter;
import game.characters.SpaceInvaderEnum;
import game.characters.Character;
import game.characters.Swarm;
import game.characters.Swarm2;


@SuppressWarnings("serial")
public class SpaceInvaders extends Board{

	public SpaceInvaders(String nameOfGame) {
		super(nameOfGame);
	}
	
	public void gameLoop() {
		boolean gameRuning = true;

		//CharacterFactory characterFactory = new CharacterFactory();
		Character player = CharacterFactory.getPlayer(400, 540);
		Character squid1 = CharacterFactory.getAlien(SpaceInvaderEnum.SQUID, 400, 0);
		Character crab1 = CharacterFactory.getAlien(SpaceInvaderEnum.CRAB, 464,0);
		Character crab3 = CharacterFactory.getAlien(SpaceInvaderEnum.CRAB, 528,0);
		Character squid2 = CharacterFactory.getAlien(SpaceInvaderEnum.SQUID, 400,64);
		Character crab2 = CharacterFactory.getAlien(SpaceInvaderEnum.CRAB, 464,64);
		Character squid3 = CharacterFactory.getAlien(SpaceInvaderEnum.SQUID, 528,64);
		
		//Place Aliens in the Swarm
		Swarm2 swarmTest = new Swarm2();
		swarmTest.setAlien(0, 0, (Alien)squid1);
		swarmTest.setAlien(0, 1, (Alien)crab1);
		swarmTest.setAlien(0, 2, (Alien)crab3);
		swarmTest.setAlien(1, 0, (Alien)squid2);
		swarmTest.setAlien(1, 1, (Alien)crab2);
		swarmTest.setAlien(1, 2, (Alien)squid3);
		
		
		while(gameRuning) {
			
			g = (Graphics2D) strategy.getDrawGraphics();
			g.setColor(Color.black);
			g.fillRect(0,0,800,600);

			player.draw(g, this);
			
			
			swarmTest.drawAliensInSwarm(g, this);
			swarmTest.moveAliensInTheSwarm();
			//move(firstColumnOfAliens);

			if(keyHandler.isLeftPressed()) {
				player.move(-2);
			} else if (keyHandler.isRightPressed()) {
				player.move(2);
			}
			
			g.dispose();
			strategy.show();
			
			try { 
				Thread.sleep(10); 
			} catch (Exception e) {
					
			}
		}
	}
	
	
	

}
