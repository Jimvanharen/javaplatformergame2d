package org.virusparadox.GameObjects;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Vector;

import org.virusparadox.maingame.Game;
import org.virusparadox.maingame.GameObject;
import org.virusparadox.maingame.GameObjectID;
import org.virusparadox.utils.Point;
import org.virusparadox.utils.Vector2;

public class Player extends GameObject {

	

	public Player(int x, int y, GameObjectID GOID) {
		super(x, y, GOID);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void update() {
		
		
	

		x += entityVelocity.x(); 
		y += entityVelocity.y();
		
	}

	@Override
	public void render(Graphics gfx) {
		
		gfx.setColor(Color.cyan);
		gfx.fillRect(x, y, 32, 32);
		
	}
	
	

	
	
	
	
	
	
	

}
