import greenfoot.*;

/**
 * Write a description of class PlayGameButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlayGameButton extends Buttons
{
    /**
     * Constructor for play game button
     */
    public PlayGameButton() {
        super(new Gameplay());
    }
    /**
     * Act - do whatever the PlayGameButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        super.clickButton();
    }    
}
