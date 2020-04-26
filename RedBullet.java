import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet shot by the ship the player controls
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class RedBullet extends Actor
{
    /**
     * Moves upward and if it reaches the top then it destroys itself
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if (y <= 3)
            getWorld().removeObject(this);
        else
            setLocation(x, y - 15);
    }    
}
