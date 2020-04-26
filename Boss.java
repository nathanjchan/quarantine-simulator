import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background for and objects in the boss level.
 * 
 * @author Ethan Chan and Jason Chan
 * @version Version Alpha
 */
public class Boss extends World
{
    Ship s;
    Heart h1;
    Heart h2;
    Heart h3;
    
    /**
     * Creates a boss ship, player ship, and the heart objects for lives.
     * 
     */
    public Boss()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        BossShip b = new BossShip();
        addObject(b, 600, 200);
        s = new Ship();
        addObject(s, 600, 650);
        h1 = new Heart();
        addObject(h1, 15, 735);
        h2 = new Heart();
        addObject(h2, 40, 735);
        h3 = new Heart();
        addObject(h3, 65, 735);
    }
    
    public void act()
    {
        if (s.lives == 2)
            removeObject(h3);
        else if (s.lives == 1)
            removeObject(h2);
        else if (s.lives <= 0)
        {
            removeObject(h1);
            Greenfoot.setWorld(new End());
        }
    }
}
