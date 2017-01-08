import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextButton extends Actor
{
    /**
     * Act - do whatever the NextButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkClicked();
        
    } 
    public void checkClicked(){
        if(Greenfoot.mousePressed(this)){
            Gameplay world = (Gameplay)getWorld();
            world.waiting=false;
            world.removeObject(this);
        }
    }
}
