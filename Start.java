import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background for the title screen.
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class Start extends World
{
    /**
     * Creates the space background for the title screen.
     */
    public Start()
    {    
        super(1200, 750, 1);
        prepare();
    }
    /**
     * Creates the start button and title objects to the title screen.
     */
    public void prepare()
    {
        StartButton start = new StartButton();
        addObject(start, 600, 600);
        Title title = new Title();
        addObject(title, 600, 275);
    }
    /**
     * Creates the action to press a key to to start the game.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            Greenfoot.setWorld(new OuterSpace());
        }
    }
}
