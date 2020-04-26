import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Second difficulty of the enemies the player must destroy
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class EnemyYellow extends Actor
{
    int counter;
    int shotProb;
    int lives;
    public EnemyYellow()
    {
        GreenfootImage g = new GreenfootImage("yellow_untitled.png");
        g.scale(100, 100);
        setImage(g);
        counter = 0;
        shotProb = 500000;
        lives = 4;
    }

    /**
     * Checks if it can shoot and if it is hit by a red bullet it decrements
     * a life. And if its lives reach zero, then it get replaced by a red 
     * enemy.
     */
    public void act() 
    {
        if (counter < Greenfoot.getRandomNumber(shotProb))

            counter++;
        else
        {
            GreenBullet g = new GreenBullet();
            getWorld().addObject(g, getX(), getY() + 25);
            counter = 0;
        }

        if (isTouching(RedBullet.class))
        {
            removeTouching(RedBullet.class);
            lives--;
            if (lives <= 0)
            {
                EnemyRed ey = new EnemyRed();
                getWorld().addObject(ey, getX(), getY());
                getWorld().removeObject(this);
            }
        }
    } 
}