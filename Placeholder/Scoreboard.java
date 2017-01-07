import greenfoot.*;
import java.util.*;
import java.awt.*;

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Scoreboard extends Actor
{
    private String filename;
    ArrayList <Integer> list = new ArrayList <Integer> ();
    /**
     * Set new properties for the scoreboard
     */
    public Scoreboard(String filename) {
        this.filename = filename;
        // Populate the scoreboard with 10 zeros
        for (int i = 0; i < list.size(); i++){
            list.add(0);
        }
    }
    
    /**
     * Add a new score to the scoreboard
     */
    public void addScore(int score) {
        int index = 1;
        int length = list.size();
        // Scan each element in the ArrayList
        if (score < list.get(0) && score > list.get(length - 1)) {
            boolean added = false;
            int i = 1;
            while (i < length && added == false) {
                if (score <= list.get(i - 1) && score >= list.get(i)) {
                    list.add(i, score);
                    added = true;
                }
                i += 1;
            }
        }
        else if (score >= list.get(0)) {
            list.add(0, score);
        }
        else if (score <= list.get(length - 1)) {
            list.add(score);
        }
    }
    
    /**
     * Return an Array of the top 10 scores
     */
    public int [] topTen() {
        int [] topTenScores = new int[10];
        for (int i = 0; i < topTenScores.length; i++) {
            topTenScores[i] = list.get(i);
        }
        return topTenScores;
    }
    
    public void displayScore() {
        int [] scores = topTen();
        
        GreenfootImage image = new GreenfootImage (400, 600);
        image.setColor (Color.WHITE);
        image.setFont (new Font ("Arial", Font.PLAIN, 20));
        image.drawString ("Top 10 High Scores", 400/2, 20);
        for (int i = 0; i < 10; i++) {
            image.drawString (i + 1 + ". " + scores[i], 400/2, (i + 2) * 30);
        }

        setImage (image);
    }
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        displayScore();
    }    
}
