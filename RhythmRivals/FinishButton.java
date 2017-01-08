import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishButton extends Actor
{
    /**
     * Act - do whatever the FinishButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        onClick();
    }    
    public void onClick(){
    if (Greenfoot.mousePressed(this)){
        //show scores
    }
    } 
}
