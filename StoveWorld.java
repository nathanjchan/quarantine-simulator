import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoveWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoveWorld extends World
{

    /**
     * Constructor for objects of class StoveWorld.
     * 
     */
    public StoveWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    private void prepare()
    {
        String interactText = "Well Done! You cooked food! You earned 20 Quarantine Coins. Press Q to quit.";
        showText(interactText, 600, 375);
        
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("q")) 
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
            MyWorld.addCoins(20);
        }
    }
}
