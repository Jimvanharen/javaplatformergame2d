package org.virusparadox.maingame;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import org.virusparadox.GameObjects.Enemy;
import org.virusparadox.GameObjects.Player;
import org.virusparadox.keyboard.KeyInput;
import org.virusparadox.utils.Point;
import org.virusparadox.utils.Vector2;
import org.virusparadox.window.Window;

//This is the main class


public class Game extends Canvas implements Runnable {
	
	public Point playerStartPos = new Point(100, 100);
	public Point enemyStartPos = new Point(200, 200);
	
	private Thread thread;
	private Handler handler;
	private Vector2 vec;
	
	private static final long serialVersionUID = -1623236461381276627L;
	
	private static final int windowWidth = 700;
	private static final int windowHeight = 600;
	private static final String windowTitle = "[Platformer2D]";
	private boolean isRunning = false;
	
	
	
	public Game()
	{
		handler = new Handler();
		this.addKeyListener(new KeyInput(handler));
		vec = new Vector2();
		vec.testVec();
		Window window = new Window(windowWidth, windowHeight, windowTitle, this);
		handler.addObject(new Player(playerStartPos.getX(), playerStartPos.getY(), GameObjectID.Player));
		handler.addObject(new Enemy(enemyStartPos.getX(), enemyStartPos.getY(), GameObjectID.Enemy));
	}
	
	public synchronized void start()
	{
		thread = new Thread(this, "GameThread");
		thread.start();
		isRunning = true;
	}
	
	public synchronized void stop()
	{
		isRunning = false;
		
		try 
		{
			thread.join();
		} 
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
		
	}
	
	@Override
	public void run() {
		long lastTime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while(isRunning)
        {
          long now = System.nanoTime();
           delta += (now - lastTime) / ns;
           lastTime = now;
           while(delta >=1)
             {
               update();
               delta--;
             }
             if(isRunning)
             render();
             frames++;
                            
            if(System.currentTimeMillis() - timer > 1000)
            {
              timer += 1000;
              System.out.println("FPS: "+ frames);
              frames = 0;
            }
        }
                stop();
		
	}
	
	public void update()
	{
		handler.update();
	}
	
	public void render()
	{
		BufferStrategy bs = getBufferStrategy();
		if(bs == null)
		{
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics gfx = bs.getDrawGraphics();
		
		gfx.setColor(Color.magenta);
		gfx.fillRect(0, 0, windowWidth, windowHeight);
		
		handler.render(gfx);
		
		
		gfx.dispose();
		bs.show();
		
	}
	
	
	public static void main(String[] args)
	{
		new Game();
	}

	
	
	

}
