import greenfoot.*;

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        PlayGameButton playgamebutton = new PlayGameButton();
        addObject(playgamebutton, 408, 360);
        HighScoreButton highscorebutton = new HighScoreButton();
        addObject(highscorebutton, 415, 417);
        highscorebutton.setLocation(408, 410);
        InstructionButton instructionbutton = new InstructionButton();
        addObject(instructionbutton, 413, 463);
        instructionbutton.setLocation(409, 463);
    }
}
