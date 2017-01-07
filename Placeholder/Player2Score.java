import greenfoot.*;
import java.awt.*;
/**
 * Write a description of class Player2Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Score extends Score
{
    private int score;
    public Player2Score (int score) {
        super(score);
    }
    /**
     * Act - do whatever the Player1Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage (new GreenfootImage ("Player 2 Score: " + score, 20, Color.WHITE, Color.BLACK));
    }    
}
