import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * First difficulty of the enemies the player must destroy
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class Enemy extends Actor
{
    int counter;
    int shotProb;
    public Enemy()
    {
        GreenfootImage g = new GreenfootImage("untitled.png");
        g.scale(100, 100);
        setImage(g);
        counter = 0;
        shotProb = 600000;
    }

    /**
     * Checks if it can shoot and if it's hit by a red bullet then it dies
     * and gets replaces by a yellow enemy.
     */
    public void act() 
    {
        if (counter < Greenfoot.getRandomNumber(shotProb))

            counter++;
        else
        {
            GreenBullet g = new GreenBullet();
            getWorld().addObject(g, getX(), getY() + 75);
            counter = 0;
        }

        if (isTouching(RedBullet.class))
        {
            removeTouching(RedBullet.class);

            EnemyYellow er = new EnemyYellow();
            getWorld().addObject(er, getX(), getY());
            getWorld().removeObject(this);
        }
    }    
}
