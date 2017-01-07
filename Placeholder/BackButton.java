import greenfoot.*;

/**
 * Write a description of class BackButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackButton extends Buttons
{
    /**
     * Constructor for play game button
     */
    public BackButton() {
        super(new Menu());
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
