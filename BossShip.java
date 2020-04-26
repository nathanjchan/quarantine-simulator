import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Final boss that the player must beat in order to win the game
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class BossShip extends Actor
{
    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    int direction;
    int stepSize = 5;
    
    static int lives = 100;
    int counter = 0;
    int shotProb = 1000;
    
    public BossShip()
    {
        direction = LEFT;
    }
    
    /**
     * Checks whether it can shoot or not and if it is hit by a red bullet
     * and decrements lives accordingly. It also moves left or right
     * and switches directions after it's hit the side of the world.
     */
    public void act() 
    {
        if (counter < Greenfoot.getRandomNumber(shotProb))

            counter++;
        else
        {
            Fireball f = new Fireball();
            getWorld().addObject(f, getX(), getY() + 25);
            counter = 0;
        }
        
        if (isTouching(RedBullet.class))
        {
            removeTouching(RedBullet.class);
            Explosion e = new Explosion();
            getWorld().addObject(e, getX(), getY());
            lives--;
            if (lives <= 0)
                Greenfoot.setWorld(new WinWorld());
        }
        
        if (direction == LEFT)
        {
            if (getX() - stepSize <= 75)
            {
                setLocation(getX(), getY());
                direction = RIGHT;
            }
            else
                setLocation(getX() - stepSize, getY());
        }
        else
        {
            if (getX() + stepSize >= 1125)
            {
                setLocation(getX(), getY());
                direction = LEFT;
            }
            else
                setLocation(getX() + stepSize, getY());
        }
    }    
}
