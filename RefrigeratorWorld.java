import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RefrigeratorWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RefrigeratorWorld extends World
{

    /**
     * Constructor for objects of class RefrigeratorWorld.
     * 
     */
    public RefrigeratorWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        showText("Stop looking at the refridgerator! Press Q and go do something else!", 600, 325);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("q")) 
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
            
        }
    }
}
