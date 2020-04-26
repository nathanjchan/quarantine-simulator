import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BathroomDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathroomDoor extends Actor
{
    /**
     * Act - do whatever the BathroomDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BathroomDoor() 
    {
        GreenfootImage a = new GreenfootImage("bathroomdoor.png");
        a.scale(250, 100);
        setImage(a);
    }    
}
