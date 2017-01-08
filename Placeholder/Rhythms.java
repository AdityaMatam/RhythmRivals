import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rhythms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rhythms extends Actor
{
    /**
     * Act - do whatever the Rhythms wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int counter = 160; 
    public void act() 
    {
        count();
    }    
    public void count(){
        counter--;
        if(counter<0){
            counter = 160;
        }
    }

}
