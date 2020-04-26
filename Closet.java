import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Closet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Closet extends Actor
{
    /**
     * Act - do whatever the Closet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Closet() 
    {
        GreenfootImage clothes = new GreenfootImage("closet.png");
        clothes.scale(200, 200);
        setImage(clothes);
    }    
}
