import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ExitDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitDoor extends Actor
{
    /**
     * Act - do whatever the ExitDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExitDoor() 
    {
        GreenfootImage exit = new GreenfootImage("exitDoor.png");
        exit.scale(200, 200);
        setImage(exit);
    }    
}
