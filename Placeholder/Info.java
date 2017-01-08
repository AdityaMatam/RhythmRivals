import greenfoot.*;
import java.util.*;
import java.awt.*;

/**
 * Write a description of class Info here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Actor
{
    /**
     * Act - do whatever the Info wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
       displayInfo();
    }
    public void displayInfo()
    {
        GreenfootImage image = new GreenfootImage (500, 700);
        image.setColor (Color.WHITE);
        image.setFont (new Font ("Arial", Font.PLAIN, 20));
        image.drawString("Player 1: A, S, D keys.", 10, 20);
        image.drawString("Player 2: J, K, L keys.", 10, 40);
        image.drawString("A song will play and orbs will down from the top",10, 80);
        image.drawString("and the player will try to hit the key when the orb",10, 100);
        image.drawString("arrives as close to as the keys.",10,120);
        image.drawString ("Everytime a player gets a perfect the player gets", 10, 140);
        image.drawString ("100 points.",10, 160);
        image.drawString ("Everytime a player gets a good the player gets", 10 , 180);
        image.drawString("80 points.", 10, 200);
        image.drawString("If a player continuously holds a key or misses the orb,", 10, 220);
        image.drawString("then the player does not get any points.", 10, 240);
        image.drawString("Good Luck and Have fun!",10, 280);
        setImage(image);
    }
}
