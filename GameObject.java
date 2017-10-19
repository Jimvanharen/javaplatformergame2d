package org.virusparadox.maingame;

import java.awt.Graphics;

import org.virusparadox.utils.Point;
import org.virusparadox.utils.Vector2;

public abstract class GameObject {
	
	
	protected int x, y;
	protected GameObjectID GOID;
	protected Vector2 entityVelocity = new Vector2();
	
	
	public GameObject(int x, int y, GameObjectID GOID)
	{
		this.x = x;
		this.y = y;
		this.GOID = GOID;
	}
	
	public abstract void update();
	public abstract void render(Graphics gfx);

	public int getXPos() {
		return x;
	}

	public void setXPoint(int x) {
		this.x = x;
		
	}

	public int getYPoint() {
		return y;
	}

	public void setYPoint(int y) {
		this.y = y;
	}

	public GameObjectID getGOID() {
		return GOID;
	}

	public void setGOID(GameObjectID gOID) {
		GOID = gOID;
	}
	
	public void setVelGoalX(int v)
	{
		 entityVelocity.setX(v);
	}
	
	public int getVelX()
	{
		
		return entityVelocity.x();
	}
	
	public void setVelGoalY(int v)
	{
		entityVelocity.setY(v);
	}
	
	public int getVelY()
	{
		
		return entityVelocity.y();
	}
	
	
	
	

}
