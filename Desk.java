import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class desk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desk extends Actor
{
    /**
     * Act - do whatever the desk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Desk() 
    {
        GreenfootImage sit = new GreenfootImage("desk.png");
        sit.scale(200, 200);
        setImage(sit);
    }    
}
