import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The game over screen.
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class End extends World
{

    /**
     * Creates the space background for the game over screen.
     */
    public End()
    {    
        super(1200, 750, 1);
        prepare();
    }
    /**
     * Creates the game over and retry objects for the game over screen.
     */
    public void prepare()
    {
        GameOver g = new GameOver();
        addObject(g, 600, 400);
        Retry retry = new Retry();
        addObject(retry, 600, 562);
        showText("Press R to retry. Press Q to quit.", 600, 700);
    }
    /**
     * Creates the action to press a key to retry the game.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("r"))
        {
            Greenfoot.setWorld(new OuterSpace());
            EnemyRed.enemyCount = 36;
        }
    }
}
