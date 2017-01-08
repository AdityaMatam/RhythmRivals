import greenfoot.*;
import java.awt.*;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Actor
{
    private int score;
    /**
     * Constructor for scores
     */
    public Score(int score) {
        this.score = score;
    }
    
    /**
     * Get the socre of the player
     */
    public int getScore() {
        return score;
    }
    
    /**
     * Add the score for the players
     */
    public void addScore (int n) {
        Gameplay world = (Gameplay)getWorld();
        world.addScore(n);
    }
    
}
