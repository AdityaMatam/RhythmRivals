import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlusSign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlusSign extends Actor
{
    int frame = 20;
    /**
     * Act - do whatever the PlusSign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       countdown();
    }
    public void countdown(){
        frame--;
        setLocation(getX(),getY()-1);
        if(frame <0){
            getWorld().removeObject(this);
        }
    }
}
