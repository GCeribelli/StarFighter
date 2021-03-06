package game;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(100,100,50,50,10);
	}

	public Ship(int x, int y)
	{
	   this(x,y,50,50,10);//add code here
	}

	public Ship(int x, int y, int s)
	{
	   this(x,y,50,50,s);//add code here
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("/game/ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
		}
	}


	public void setSpeed(int s)
	{
	   speed = s;//add more code
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
            if(direction == "right")
		setX(getX() + getSpeed());//add code here
            else if(direction == "down")
                setY(getY() + getSpeed());
            else if(direction == "up")
                setY(getY() - getSpeed());
            else if(direction == "left")
                setX(getX() - getSpeed());
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + getSpeed();
	}
}
