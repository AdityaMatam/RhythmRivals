import greenfoot.*;

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    private World world;
    /**
     * Constructor for buttons
     */
    public Buttons (World world) {
        this.world = world;
    }
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void clickButton() 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked (this)) {
            Greenfoot.setWorld (world);
            getWorld().removeObject(this);
        }
    }    
}
