import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sink extends Actor
{
    /**
     * Act - do whatever the Sink wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sink() 
    {
        GreenfootImage wash = new GreenfootImage("sink.png");
        wash.scale(200, 200);
        setImage(wash);
    }    
}
