import greenfoot.*;

/**
 * Write a description of class InstructionButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionButton extends Buttons
{
    /**
     * Constructor for play game button
     */
    public InstructionButton() {
        super(new Instructions());
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
