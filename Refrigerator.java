import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Refrigerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Refrigerator extends Actor
{
    /**
     * Act - do whatever the Refrigerator wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Refrigerator() 
    {
        GreenfootImage freeze = new GreenfootImage("refrigerator.png");
        freeze.scale(200, 200);
        setImage(freeze);
    }    
}
