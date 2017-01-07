import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameplay extends World
{
    int counter = 200;
    boolean isRhythmA = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Gameplay(){
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1); 
        prepare();
    }
    public void act(){
        RhythmA();
        count();
    }
    public void count(){
        counter--;
        if(counter<0){
            counter = 200;
        }
    }
    public void RhythmA(){
        if(isRhythmA){
            if(counter%60==0){
                spawnBeatA();
            }
        }
    }
    public void spawnBeatA(){
        addObject(new Orb("a"),66,0);
        setPaintOrder(Key.class);
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {


        addObject(new Key("a"),66,274);
        addObject(new Key("s"),196,274);
        addObject(new Key("d"),326,274);
        addObject(new Key("l"),744,274);
        addObject(new Key("k"),614,274);
        addObject(new Key("j"),484,274);
        Player1Score player1score = new Player1Score(0);
        addObject(player1score, 58, 520);
        Player2Score player2score = new Player2Score(0);
        addObject(player2score, 750, 521);
        player1score.setLocation(68, 511);
        player2score.setLocation(741, 510);
    }
}
