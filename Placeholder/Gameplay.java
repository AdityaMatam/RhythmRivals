import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameplay extends World
{
    int counter = 160; 
    boolean isRhythmA = true;
    int score = 0;
    int songCounter=0;
    List <String> songs = new ArrayList<String>();
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
        playSound();
    }
    public void playSound(){
       if (songCounter < songs.size()){
          GreenfootSound sound = new GreenfootSound(songs.get(songCounter));
          if (!sound.isPlaying()){
             sound = new GreenfootSound(songs.get(songCounter));
             sound.play();
             songCounter++;
          }
       }
    }
    public void addScore(int increase){
        score += increase;
    }
    public void count(){
        counter--;
        if(counter<0){
            counter = 160;
        }
    }

    public void RhythmA(){
        if(isRhythmA){
            if(counter==160){
                spawnBeatA();
            }
            else if(counter == 130){
                spawnBeatA();
            }
            else if(counter == 100){
                spawnBeatA();
            }
            else if(counter == 70){
                spawnBeatS();
            }
            else if(counter == 60){
                spawnBeatS();
            }
            else if(counter == 30){
                spawnBeatA();
            }

        }
    }

    public void spawnBeatA(){
        addObject(new Orb("a"),66,0);
        setPaintOrder(Key.class);
    }

    public void spawnBeatS(){
        addObject(new Orb("s"),196,0);
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
        songs.add("The Weeknd - Starboy (Beatbox Cover) ft. Daft Punk - by KRNFX.mp3");
        Collections.shuffle(songs);
    }
}
