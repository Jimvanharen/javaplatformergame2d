package org.virusparadox.keyboard;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import org.virusparadox.GameObjects.Player;
import org.virusparadox.maingame.GameObject;
import org.virusparadox.maingame.GameObjectID;
import org.virusparadox.maingame.Handler;

public class KeyInput extends KeyAdapter {
	
	private Handler handler;
	
	public KeyInput(Handler handler)
	{
		this.handler = handler;
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getGOID() == GameObjectID.Player)
			{
				
			
				//Player key inputs:
				
				if(key == KeyEvent.VK_A)
				{
					tempObject.setVelGoalX(-5);
				}
				
				if(key == KeyEvent.VK_D)
				{
					tempObject.setVelGoalX(5);
				}
				
				if(key == KeyEvent.VK_W)
				{
					tempObject.setVelGoalY(-5);
				}
				
				if(key == KeyEvent.VK_S)
				{
					tempObject.setVelGoalY(5);
				}
				
				
			}
		}
		
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		
		int key = e.getKeyCode();
		
		for(int i = 0; i < handler.object.size(); i++)
		{
			GameObject tempObject = handler.object.get(i);
			
			if(tempObject.getGOID() == GameObjectID.Player)
			{
				
			
				//Player key inputs:
				
				if(key == KeyEvent.VK_A)
				{
					tempObject.setVelGoalX(0);
				}
				
				if(key == KeyEvent.VK_D)
				{
					tempObject.setVelGoalX(0);
				}
				
				if(key == KeyEvent.VK_W)
				{
					tempObject.setVelGoalY(0);
				}
				
				if(key == KeyEvent.VK_S)
				{
					tempObject.setVelGoalY(0);
				}
				
				
			}
		}
	}
	
	
	

}
