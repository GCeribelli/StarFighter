package game;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde {

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private List<Alien> aliens;

    public AlienHorde(int size) {
        aliens = new ArrayList<Alien>();
        for(int i = 0; i < size; i++){
            add(new Alien(1 + i * 100, 100, 50,50,2));
        }
        for(int i = 0; i < size; i++){
            add(new Alien(1 + i * 100, 200, 50,50,2));
        }
    }

    public void add(Alien al) {
        aliens.add(al);
    }

    public void drawEmAll(Graphics window) {
        for (Alien n : aliens) {
            n.draw(window);
        }
    }

    public void moveEmAll() {
        for(Alien i: aliens){
                if(i.getX() <= 0){
                    i.setY(i.getY()+i.getHeight());
                    i.setSpeed(-i.getSpeed());
                }else if(i.getX()+i.getWidth() >= 800){
                    i.setY(i.getY()+i.getHeight());
                    i.setSpeed(-i.getSpeed());
                }
                if(i.getY() >= 600){
                    i.setY(0);
                }
                i.setX(i.getX()+i.getSpeed());
            }
    }

    public void removeDeadOnes(List<Ammo> shots) {
        for(Ammo a : shots){
            for(int i = 0; i < aliens.size(); i++){
                if((a.getY() <= aliens.get(i).getY() + aliens.get(i).getHeight()) && (a.getY() >= aliens.get(i).getY()) && (a.getX() <= aliens.get(i).getX() + aliens.get(i).getWidth()) && (a.getX() >= aliens.get(i).getX())){
                    aliens.remove(i);
                }
        }
    }
    }

    public String toString() {
        return "";
    }
}
