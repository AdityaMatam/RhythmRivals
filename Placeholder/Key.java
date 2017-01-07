import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    int rotation = 0;
    boolean isPressed = false;
    String key;
    int defaultRotation = getRotation();
    public Key(String key){
        this.key = key;
        setImage(key+"-key.png");
    }
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        checkPressed();
        resetPressedStatus();
    }
    public void checkPressed(){
        if(Greenfoot.isKeyDown(key) && !isPressed){
            isPressed = true;
            rotation+=60;
            if(rotation>0){
                rotation=30;
            }
            setRotation(defaultRotation+rotation);
        }
        else{
            rotateBack();
        }
    }
    public void resetPressedStatus(){
        if(!Greenfoot.isKeyDown(key) && isPressed){
            isPressed = false;
        }
    }
    public void rotateBack(){
        if(rotation>0){
            rotation-=2;
            setRotation(defaultRotation+rotation);
        }
    }
}
