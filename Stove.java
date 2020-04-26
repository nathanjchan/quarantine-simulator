import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stove here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stove extends Actor
{
    /**
     * Act - do whatever the Stove wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Stove() 
    {
        GreenfootImage heat = new GreenfootImage("stove.png");
        heat.scale(200, 200);
        setImage(heat);
    }    
}
