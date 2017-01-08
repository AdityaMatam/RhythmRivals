import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RhythmA here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RhythmA extends Rhythms
{
    /**
     * Act - do whatever the RhythmA wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
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
}
