import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exitStairs here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ExitStairs extends Actor
{
    /**
     * Act - do whatever the exitStairs wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ExitStairs() 
    {
        GreenfootImage exit = new GreenfootImage("ExitStairs.png");
        exit.scale(200, 200);
        setImage(exit);
    }    
}
