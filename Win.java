import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background for the win screen.
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class Win extends World
{
    /**
     * Creates the space background for the win screen.
     */
    public Win()
    {    
        super(1200, 750, 1);
        prepare();
    }
    /**
     * Creates the you win and retry objects to the win screen.
     */
    public void prepare()
    {
        YouWin g = new YouWin();
        addObject(g, 575, 350);
        Retry retry = new Retry();
        addObject(retry, 600, 600);
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
