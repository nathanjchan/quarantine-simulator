import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background for the win screen.
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class WinWorld extends World
{
    /**
     * Creates the space background for the win screen.
     */
    public WinWorld()
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
        MyWorld.addCoins(20);
        showText("You earned 20 Quarantine Coins! Press Q to quit.", 600, 700);
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
        if (Greenfoot.isKeyDown("q")) {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
    }
}
