import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class stairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stairs extends Actor
{
    /**
     * Act - do whatever the stairs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Stairs() 
    {
        GreenfootImage up = new GreenfootImage("stairs.png");
        up.scale(200, 200);
        setImage(up);
    }    
}
