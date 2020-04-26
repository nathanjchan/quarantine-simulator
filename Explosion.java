import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Creates an explosion when the boss ship gets hit.
 * 
 * @author Ethan Chan and Jason Chan
 * @version Version Alpha
 */
public class Explosion extends Actor
{
    int counter = 0;
    /**
     * Explosion stays for five counts before deleting itself.
     */
    public void act() 
    {
        counter ++;
        if (counter == 5)
            getWorld().removeObject(this);
    }    
}
