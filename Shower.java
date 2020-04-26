import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shower extends Actor
{
    /**
     * Act - do whatever the Shower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Shower() 
    {
        GreenfootImage a = new GreenfootImage("shower.png");
        a.scale(200, 200);
        setImage(a); 
    }    
}
