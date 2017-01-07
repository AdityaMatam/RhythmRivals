import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    GreenfootImage img = new GreenfootImage("greycircle.png");
    int maxWidth = img.getWidth();
    int maxHeight = img.getHeight();
    int currentWidth=50;
    int currentHeight=50;
    int frame = 30;
    public Orb(){
        img.scale(50,50);
        setImage(img);
    }
    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        sizeUp();
        checkDeletion();
    }
    public void sizeUp(){
        
        img.scale(currentWidth,currentHeight);
        setImage(img);
        img = new GreenfootImage("greycircle.png");
        if(currentWidth<maxWidth){
            currentWidth++;
            
        }
        if(currentHeight<maxHeight){
            currentHeight++;
        }
    }
    public void checkDeletion(){
        if(currentWidth == 100){
            getWorld().removeObject(this);
        }
    }

}
