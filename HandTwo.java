import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HandTwo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HandTwo extends Actor
{
    /**
     * Act - do whatever the HandTwo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int pcount = 8;
    public void act() 
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("a"))
        {   
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(5);
        }
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a"))
        {
            setRotation(225);
            move(5);
        }
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            setRotation(315);
            move(5);
        }
        if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setRotation(135);
            move(5);
        }
        if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setRotation(45);
            move(5);
        }
        if (Greenfoot.isKeyDown("e"))
        {
            if ((isTouching(washhand1.class) || (isTouching(washhand2.class) || (isTouching(washhand3.class)
            || (isTouching(washhand4.class) || (isTouching(washhand5.class) || (isTouching(washhand6.class)
            || (isTouching(washhand7.class) || (isTouching(washhand8.class))))))))))
            {
                removeTouching(Object.class);
                pcount--;
            }
        }
    }    
    public static int getObjectsCollected()
    {
        return pcount;
    }
    public static void resetObjectsCollected() {
        pcount = 8;
    }
}
