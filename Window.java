package org.virusparadox.window;

import java.awt.Dimension;

import javax.swing.JFrame;

import org.virusparadox.maingame.Game;

public class Window {
	
	private JFrame frame;
	
	
	public Window(int width, int height, String windowTitle, Game game)
	{
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setSize(new Dimension(width, height));
		frame.setPreferredSize(new Dimension(width, height));
		frame.setMinimumSize(new Dimension(width, height));
		frame.setMaximumSize(new Dimension(width, height));
		frame.setTitle(windowTitle);
		frame.setLocationRelativeTo(null);
		frame.add(game);
		frame.setVisible(true);
		game.start();
		
	}
	
	

}
