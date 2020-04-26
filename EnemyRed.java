import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Hardest enemy that the player must destroy.
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class EnemyRed extends Actor
{
    int counter;
    int shotProb;
    static int enemyCount = 36;
    int lives;
    public EnemyRed()
    {
        GreenfootImage g = new GreenfootImage("red_untitled.png");
        g.scale(100, 100);
        setImage(g);
        counter = 0;
        shotProb = 500;
        lives = 2;
    }

    /**
     * Checks if it can shoot and if it's hit by a red bullet then it loses
     * a life. If its lives reach zero, the total enemyCount is decremented.
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
                enemyCount--;
                getWorld().removeObject(this);
            }

            if (enemyCount <= 0)
                Greenfoot.setWorld(new Continue());
        }
    }  
}
