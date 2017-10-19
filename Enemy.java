package org.virusparadox.GameObjects;

import java.awt.Color;
import java.awt.Graphics;

import org.virusparadox.maingame.GameObject;
import org.virusparadox.maingame.GameObjectID;
import org.virusparadox.utils.Vector2;

public class Enemy extends GameObject {
	
	

	public Enemy(int x, int y, GameObjectID GOID) {
		super(x, y, GOID);
	}

	@Override
	public void update() {
		
		
		
	}

	@Override
	public void render(Graphics gfx) {
		gfx.setColor(Color.red);
		gfx.fillRect(x, y, 64, 64);
	}
	
	

}
