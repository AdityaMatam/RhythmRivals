import greenfoot.*;

/**
 * Write a description of class Scoreboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HighScore extends World
{

    /**
     * Constructor for objects of class Scoreboard.
     * 
     */
    public HighScore()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1); 
        addObject(new Scoreboard("ListOfScores.in"), getWidth()/2 - 100, getHeight()/2 + 100); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
    }
}
