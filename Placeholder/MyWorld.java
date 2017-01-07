import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(810, 540, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Orb orb = new Orb();
        addObject(orb,440,246);
        orb.setLocation(384,235);

        orb.setLocation(66,270);

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
