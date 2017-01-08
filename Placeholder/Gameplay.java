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
    boolean init = true;
    List <String> songs = new ArrayList<String>();
    GreenfootSound sound;
    String songName;
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
        if (sound.isPlaying()){
            Rhythm();
        }
        if (songCounter > songs.size() && !sound.isPlaying()) {
            gameOverDisplay();
        }
        count();
        playSound();
    }

   public void playSound(){
       if (songCounter < songs.size()){
           if(init){
              init=false;
              sound = new GreenfootSound(songs.get(songCounter));
              songName = songs.get(songCounter);
              sound.play();
              songCounter++;
              System.out.println(songCounter);
          }
          else if (!sound.isPlaying()){
              init = true;
          }
       }
    }
    public void gameOverDisplay(){
        addObject(new PlayAgainButton(), 405, 270);
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

    public void Rhythm(){
        //If song 1
        
        if (songName.contains("The Weeknd")){
            RhythmA();
        }
        else if (songName.contains("Electro-Light")){
            RhythmB();
        }
        else if (songName.contains("Wiggle")){
            
        }
        else if (songName.contains("Gold")){
            
        }
        else if (songName.contains("Fireflies")){
            
        }
    }
    
    public void RhythmA(){
        if(counter==160){
                spawnBeatRandom();
            }
            else if(counter == 130){
                spawnBeatRandom();
            }
            else if(counter == 100){
                spawnBeatRandom();
            }
            else if(counter == 70){
                spawnLeftBeat();
            }
            else if(counter == 60){
                spawnRightBeat();
            }
            else if(counter == 30){
                spawnBeatRandom();
        }
    }
    
    public void RhythmB()
    {
        if(counter==160){
                spawnBeatRandom();
            }
            else if(counter == 130){
                spawnBeatRandom();
            }
            else if(counter == 100){
                spawnBeatRandom();
            }
            else if(counter == 70){
                spawnLeftBeat();
            }
            else if(counter == 60){
                spawnRightBeat();
            }
            else if(counter == 30){
                spawnBeatRandom();
        }
    }

    public void spawnLeftBeat(){
        spawnBeatA();
        spawnBeatJ();
    }

    public void spawnRightBeat(){
        spawnBeatD();
        spawnBeatL();
    }
    public void spawnBeatRandom(){
        int player1Position = (int) (Math.random() * 3);
        if (player1Position==0){
            spawnBeatA();
        }
        else if (player1Position==1)
        {
            spawnBeatS();
        }
        else if (player1Position==2)
        {
            spawnBeatD();
        }
        int player2Position = (int) (Math.random() * 3) + 3;
        if (player2Position==3)
        {
            spawnBeatJ();
        }
        else if (player2Position==4)
        {
            spawnBeatK();
        }
        else if (player2Position==5)
        {
            spawnBeatL();
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

    public void spawnBeatD() {
        addObject (new Orb("d"), 326, 0);
        setPaintOrder(Key.class);
    }

    public void spawnBeatJ() {
        addObject (new Orb("j"), 484, 0);
        setPaintOrder(Key.class);
    }

    public void spawnBeatK() {
        addObject (new Orb("k"), 614, 0);
        setPaintOrder(Key.class);
    }

    public void spawnBeatL() {
        addObject (new Orb("l"), 744, 0);
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
        //songs.add("Electro-Light - Symbolism.mp3");
        Collections.shuffle(songs);
        songName = songs.get(songCounter);
        sound = new GreenfootSound(songs.get(songCounter));
    }
}
