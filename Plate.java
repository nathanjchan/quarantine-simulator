import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plate here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plate extends Actor
{
    /**
     * Act - do whatever the Plate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Plate() 
    {
        GreenfootImage yum = new GreenfootImage("plate.png");
        yum.scale(1000, 1000);
        setImage(yum);
    }    
}
