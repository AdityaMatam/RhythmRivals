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
        In in = new In (filename);
        // Populate the scoreboard with a list of scores from the given file
        while (in.hasNextLine()){
            int score = Integer.valueOf(in.readLine());
            list.add(score);
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
     * Write the score onto the file
     */
    public void writeScore() {
        Out out = new Out(filename);
        for (int i = 0; i < list.size(); i++) {
            out.println(list.get(i));
        }
    }
    
    /**
     * Return an Array of the top 10 scores
     */
    public int [] topTen() {
        int [] a = new int[10];
        return a;
    }
    
    public void displayScore() {
    }
    
    /**
     * Act - do whatever the Scoreboard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
