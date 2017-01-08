import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
/**
 * Write a description of class DisplayScore2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayScore2 extends Actor
{
    /**
     * Act - do whatever the DisplayScore2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         // Add your action code here.
         Gameplay world = (Gameplay)getWorld();
         setImage (new GreenfootImage ("Player 2 Final Score: " + world.score2, 25, Color.WHITE, Color.BLACK));
    }    
}
