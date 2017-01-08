import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Orb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Orb extends Actor
{
    GreenfootImage img = new GreenfootImage("greycircle4.png");
    int currentWidth=11;
    int currentHeight=11;
    int frame = 30;
    String type;
    public Orb(String type){
        this.type = type;
        img.scale(currentWidth,currentHeight);
        setImage(img);
    }

    /**
     * Act - do whatever the Orb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        sizeUp();
        fall();
        checkDeletion();
    }

    public void sizeUp(){

        img.scale(currentWidth,currentHeight);
        setImage(img);
        img = new GreenfootImage("greycircle4.png");
        if(getY()<266){
            currentWidth+=1;
            currentHeight+=1;
        }
        if(getY()>=266){
            currentHeight -= 2;
            currentWidth -=2;
        }
    }

    public void checkDeletion(){
        if (Greenfoot.isKeyDown(type) && getY() < 400){
            Gameplay world = (Gameplay)getWorld();
            if (getY() >= 256 && getY()<= 276){
                //add 2 to player score

                world.addScore(100);
                getWorld().removeObject(this);
            }
            else if (getY() >= 236 && getY()<= 296)
            {
                //add 1 to player score
                world.addScore(80);
                getWorld().removeObject(this);
            }
            else if(getY() >= 206 && getY() <= 326)
            {
                getWorld().removeObject(this);
            }
        }
        else if (getY() >= 400){
            getWorld().removeObject(this);
        }
    }

    public void fall(){
        setLocation(this.getX(),this.getY()+3);
    }

}
