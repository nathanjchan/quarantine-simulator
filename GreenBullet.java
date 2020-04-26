import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Bullet shot by the enemy ships
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class GreenBullet extends Actor
{
    /**
     * Moves downward and if it reaches the bottom of the world then it 
     * deletes itself
     */
    public void act() 
    {
        int x = getX();
        int y = getY();
        if (y >= 747)
            getWorld().removeObject(this);
        else
            setLocation(x, y + 10);
    }    
}
