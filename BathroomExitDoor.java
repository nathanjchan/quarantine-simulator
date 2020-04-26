import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BathroomExitDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathroomExitDoor extends Actor
{
    /**
     * Act - do whatever the BathroomExitDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BathroomExitDoor() 
    {
        GreenfootImage a = new GreenfootImage("bathroomexitdoor.png");
        a.scale(250, 100);
        setImage(a);
    }    
}
