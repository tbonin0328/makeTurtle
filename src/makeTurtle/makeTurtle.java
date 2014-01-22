package makeTurtle;

import java.awt.Color;
import java.awt.event.KeyEvent;

import acm.graphics.*;
import acm.program.GraphicsProgram;

public class makeTurtle extends GraphicsProgram {
	
	private static final int APP_WIDTH = 300;
	private static final int APP_HEIGHT = 300;
	private static final int TURTLE_X = 100;
	private static final int TURTLE_Y = 100;
	private static final int STEP = 20;
	
	GTurtle turtle;
	
	public void run()
	{
		addKeyListeners();
		setSize(APP_WIDTH, APP_HEIGHT);
		turtle = new GTurtle(TURTLE_X, TURTLE_Y);
		add(turtle);
	}
	
	public void keyPressed(KeyEvent e)
	{
		switch(e.getKeyCode())
		{
		case KeyEvent.VK_RIGHT:
			turtle.setDirection(0);
			turtle.move(STEP, 0);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_LEFT:
			turtle.setDirection(180);
			turtle.move(-STEP, 0);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_UP:
			turtle.setDirection(90);
			turtle.move(0, -STEP);
			//turtle.forward(10);
			break;
		case KeyEvent.VK_DOWN:
			turtle.setDirection(270);
			turtle.move(0, STEP);
			//turtle.forward(10);
			break;
		}
		
	}

}
