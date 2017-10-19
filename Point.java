package org.virusparadox.utils;

public class Point {
	
	//A point is much like a vector but it is more of a starting point it doesnt have a direction nor a magnitude its just a place on the map.
	//The point is going to handle everything for the location of entities.
	
	private int x, y;
	
	public void add(Vector2 vec)
	{
		this.x += vec.x();
		this.y += vec.y();
	}
	
	public Point(int x, int y)
	{
		this.setX(x);
		this.setY(y);
	}
	
	public Point()
	{
		set(0, 0);
	}
	
	public void set(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public Point setX(int x) {
		this.x = x;
		return this;
	}

	public int getY() {
		return y;
	}

	public Point setY(int y) {
		this.y = y;
		return this;
	}
	
	
	

}
