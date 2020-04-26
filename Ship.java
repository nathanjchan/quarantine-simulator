import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The ship that the player controls to shoot the enemy ships
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class Ship extends Actor
{
    int x;
    int y;
    int counter;
    int shotTimer;
    int lives;
    public Ship()
    {
        GreenfootImage g = new GreenfootImage("betterShip.png");
        g.scale(80, 80);
        setImage(g);
        x = 600;
        y = 650;
        shotTimer = 0;
        lives = 3;
    }

    /**
     * Checks if the left or right arrow keys are pressed down and moves
     * accordingly. If space is pressed down then shoot. Also check if it
     * is hit by a green bullet or fireball and decrements lives 
     * accordingly.
     */
    public void act() 
    {      
        if (Greenfoot.isKeyDown("w") && (shotTimer >= 5))
        {
            shoot();
            shotTimer = 0;
        }

        if (Greenfoot.isKeyDown("a"))
        {
            if (x - 10 <= 45)
                x = 45;
            else
            {
                x -= 10;
                setLocation(x, y);
            }
        }

        if (Greenfoot.isKeyDown("d"))
        {
            if (x + 10 >= 1155)
                x = 1155;
            else
            {
                x += 10;
                setLocation(x, y);
            }
        }
        shotTimer++;
        
        if (isTouching(GreenBullet.class))
        {
            removeTouching(GreenBullet.class);
            lives--;
            GreenfootSound oof = new GreenfootSound("oof.mp3");
            oof.play();
        }
        
        if (isTouching(Fireball.class))
        {
            removeTouching(Fireball.class);
            lives--;
            GreenfootSound oof = new GreenfootSound("oof.mp3");
            oof.play();
        }
    }
    
    /**
     * Creates 2 red bullets and shoots them at the enemies
     */
    public void shoot()
    {
        RedBullet r = new RedBullet();
        getWorld().addObject(r, getX() - 20, getY() - 35);
        RedBullet r2 = new RedBullet();
        getWorld().addObject(r2, getX() + 20, getY() - 35);
        GreenfootSound pew = new GreenfootSound("pew.wav");
        pew.play();
    }
}
