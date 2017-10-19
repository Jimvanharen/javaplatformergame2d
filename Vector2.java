package org.virusparadox.utils;

import java.awt.Graphics;

import org.virusparadox.exceptions.TValueException;
import org.virusparadox.maingame.GameObject;

public class Vector2{
	
	/*In real life a vector has a direction and a magnitude(length)
	 * However in computers you dont have such things as a direction and a magnitude.
	 * In computers we use x and y.
	*/
	
	private int x;
	private int y;
	
	public Vector2()
	{
		set(0, 0);
	}
	
	public Vector2(Vector2 vector)
	{
		set(vector.x, vector.y);
	}
	
	public Vector2(int x, int y)
	{
		set(x, y);
	}
	
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public Vector2 add(Vector2 vector)
	{
		this.x += vector.x;
		this.y += vector.y;
		return this;
	}
	
	public Vector2 subtract(Vector2 vector)
	{
		this.x -= vector.x;
		this.y -= vector.y;
		return this;
	}	
	
	public int x()
	{
		return this.x;
	}
	
	public Vector2 setX(int x)
	{
		this.x = x;
		return this;
	}
	
	public int y()
	{
		return y;
	}
	
	public Vector2 setY(int y)
	{
		this.y = y;
		return this;
	}
	
	public double magnitude(Vector2 vector)
	{
		double xSum = vector.x() * vector.x();
		double ySum = vector.y() * vector.y();
		double xySum = xSum + ySum;
		
		return Math.sqrt(xySum);
	}
	
	public static float Approach(float flGoal, float flCurrent, float dt)
	{
		
		float flDifference = flGoal - flCurrent;
		
		if(flDifference > dt)
		{
			return flCurrent + dt;
		}
		if(flDifference < -dt)
		{
			return flCurrent - dt;
		}
		
		return flGoal;
		
		
	}
	
	
	public void testVec()
	{
		
		
	}

	


}
