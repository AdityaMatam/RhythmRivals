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
    boolean isPressed = false;
    int transparency = 255;
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
        if(!isPressed){
            sizeUp();
            fall();

            checkDeletion();
        }
        else{
            updateColor();
            if(transparency>0){
                transparency-=30;
                if(transparency<=0){
                    getWorld().removeObject(this);
                }
                else{
                    GreenfootImage img = getImage();
                    img.setTransparency(transparency);
                    setImage(img);
                }
            }
        }
    }

    public void sizeUp(){

        img.scale(currentWidth,currentHeight);
        setImage(img);

        img = new GreenfootImage("greycircle4.png");

        if(getY()<266){
            currentWidth+=2;
            currentHeight+=2;
        }
        if(getY()>=266){
            currentHeight -= 2;
            currentWidth -=2;
        }
    }

    public void checkDeletion(){
        int score = 0;
        if (Greenfoot.isKeyDown(type) && getY() < 400 ){

            Gameplay world = (Gameplay)getWorld();
            if (getY() >= 269 && getY()<= 279){
                //add 2 to player score

                score = 100;

                isPressed = true;
            }
            else if (getY() >= 246 && getY()<= 286)
            {
                //add 1 to player score
                score = 80;

                isPressed = true;
            }
            else if(getY() >= 236 && getY() <= 296)
            {

                isPressed = true;
            }
            if(type =="a" || type=="s" || type=="d"){
                world.addScore1(score);
                if(score>0){
                    world.addObject(new PlusSign(),168,511);
                }
            }
            else{
                world.addScore2(score);
                if(score>0){
                    world.addObject(new PlusSign(),601,511);
                }
            }
        }
        else if (getY() >= 400){
            getWorld().removeObject(this);
        }
    }

    public void updateColor(){
        if (getY() >= 269 && getY()<= 279){

            img = new GreenfootImage("fullpoints.png");
            setImage(img);

        }
        else if (getY() >= 246 && getY()<= 286)
        {

            img = new GreenfootImage("partpoints.png");
            setImage(img);

        }
        else if(getY() >= 206 && getY() <= 326)
        {
            img = new GreenfootImage("nopoints.png");
            setImage(img);
        }

    }

    public void fall(){
        setLocation(this.getX(),this.getY()+5);
    }

}
