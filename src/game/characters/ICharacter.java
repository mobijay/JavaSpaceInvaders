package game.characters;

import game.space.invaders.SpaceInvaders;

import java.awt.Graphics;


public  interface ICharacter {
	public void draw(Graphics g, SpaceInvaders gameScreen);
	public void move(int movement);
}
