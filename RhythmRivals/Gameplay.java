import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.Math;

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
    int score1 = 0;
    int score2 = 0;
    int songCounter=0;
    int random = (int )(Math.random() * 6 + 1);
    boolean init = true, waiting = false;
    List <String> songs = new ArrayList<String>();
    GreenfootSound sound;
    String songName;
    boolean startedFirstSong=false;
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
            count();
        }
        else if (songCounter == songs.size() && getObjects(MenuButton.class).isEmpty()) {
            addObject(new FinishButton(), 405, 200);
        }
        if (!waiting){
            playSound();
        }
        if (!sound.isPlaying() && startedFirstSong && !waiting){
            init = true;
            waiting = true;
            addObject(new NextButton(),405, 200);
        }
            
        
        
    }

    public void playSound(){
        if (songCounter < songs.size()){
            if(init && !waiting){
                init=false;
                sound = new GreenfootSound(songs.get(songCounter));
                songName = songs.get(songCounter);
                sound.play();
                songCounter++;
                startedFirstSong = true;
            }
            else if (!sound.isPlaying()){
                init=true;
                random = (int )(Math.random() * 6 + 1);
            }
        }
    }

    public void gameOverDisplay(){
        addObject(new PlayAgainButton(), 405, 270);
    }

    public void addScore1(int increase){
        score1 += increase;
    }

    public void addScore2(int increase){
        score2 += increase;
    }

    public void count(){

        counter--;
        if(counter<0){
            counter = 160;
        }
    }

        public void Rhythm(){
        if (random == 1)
            RhythmA();
        else if (random == 2)
            RhythmB();
        else if (random == 3)
            RhythmC();
        else if (random == 4)
            RhythmD();
        else if (random == 5)
            RhythmE();
        else
            RhythmF();
        
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
    public void RhythmC()
    {
        if(counter==160){
                spawnBeatRandom();
            }
            else if(counter == 140){
                spawnBeatRandom();
            }
            else if(counter == 120){
                spawnBeatRandom();
            }
            else if(counter == 100){
                spawnLeftBeat();
            }
            else if(counter == 80){
                spawnRightBeat();
            }
            else if(counter == 55){
                spawnBeatRandom();
        }
    }
    public void RhythmD()
    {
        if(counter==160){
                spawnBeatRandom();
            }
            else if(counter == 145){
                spawnBeatRandom();
            }
            else if(counter == 110){
                spawnBeatRandom();
            }
            else if(counter == 80){
                spawnLeftBeat();
            }
            else if(counter == 40){
                spawnRightBeat();
            }
            else if(counter == 20){
                spawnBeatRandom();
        }
    }
    public void RhythmE()
    {
        if(counter==160){
                spawnBeatRandom();
            }
            else if(counter == 120){
                spawnBeatRandom();
            }
            else if(counter == 90){
                spawnBeatRandom();
            }
            else if(counter == 70){
                spawnLeftBeat();
            }
            else if(counter == 40){
                spawnRightBeat();
            }
            else if(counter == 20){
                spawnBeatRandom();
        }
    }
    public void RhythmF()
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
            else if(counter == 40){
                spawnRightBeat();
            }
            else if(counter == 10){
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
        player2score.setLocation(701, 510);
        songs.add("The Weeknd - Starboy (Beatbox Cover) ft. Daft Punk - by KRNFX.mp3");
        songs.add("Electro-Light - Symbolism.mp3");
        songs.add("Jason Derulo - Wiggle.mp3");
        songs.add("Kiiara - Gold (J Farell Remix).mp3");
        songs.add("Owl City - Fireflies (Said The Sky Remix).mp3");
        songs.add("Rihanna - Umbrella (BLU J Remix).mp3");
        Collections.shuffle(songs);
        songName = songs.get(songCounter);
        sound = new GreenfootSound(songs.get(songCounter));
    }
}
