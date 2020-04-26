import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The screen to continue to the boss level
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class Continue extends World
{

    /**
     * Creates the space background for the temporary screen.
     */
    public Continue()
    {    
        super(1200, 750, 1); 
        prepare();
    }
    /**
     * Creates the continue message window.
     */
    public void prepare()
    {
        ContinueButton c = new ContinueButton();
        addObject(c, 600, 400);
    }
    /**
     * Creates the action to press a key to continue to the boss level.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("c"))
        {
            Greenfoot.setWorld(new Boss());
            BossShip.lives = 75;
        }
    }
}
