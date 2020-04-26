import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClosetWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClosetWorld extends World
{

    /**
     * Constructor for objects of class ClosetWorld.
     * 
     */
    public ClosetWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("q")) {
            UpstairsWorld up = new UpstairsWorld();
            Greenfoot.setWorld(up);
            MyWorld.addCoins(5);
        }
    }
    public void prepare()
    {
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
        Coins point = new Coins();
        addObject(point, 1000, 650);
        showText("You tried on clothes and earned 5 Quarantine Coins! Press Q to quit.", 600, 700);
    }
}
