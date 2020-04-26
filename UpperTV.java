import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpperTV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpperTV extends Actor
{
    /**
     * Act - do whatever the UpperTV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public UpperTV() 
    {
        GreenfootImage watch = new GreenfootImage("TV.png");
        watch.scale(200, 200);
        setImage(watch);
    }     
}
