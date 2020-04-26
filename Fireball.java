import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates the object that the boss ship shoots.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    /**
     * Move the fireball from the boss ship to the player's ship, deletes itself
     * once it reaches the bottom of the screen.
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if (y >= 747)
            getWorld().removeObject(this);
        else
            setLocation(x, y + 5);
    }    
}
