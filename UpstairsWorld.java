import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UpstairsWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpstairsWorld extends World
{

    /**
     * Constructor for objects of class UpstairsWorld.
     * 
     */
    public UpstairsWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }

    private void prepare()
    {
        Desk pow = new Desk();
        TV watch = new TV();
        Bed sleep = new Bed();
        ExitStairs exit = new ExitStairs();
        Closet clothes = new Closet();
        Player person = new Player();

        addObject(pow, 600, 75);
        addObject(watch, 100, 75);
        addObject(sleep, 100, 375);
        addObject(exit, 1120, 635);
        addObject(clothes, 1100, 100);
        addObject(person, 900, 635);
        
        String coinText = "x " + MyWorld.getCoins();
        //String interactText = "Press E to interact with objects";

        showText(coinText, 1040, 650);
        //showText(interactText, 600, 10);
        Coins point = new Coins();
        addObject(point, 1000, 650);
    }
}
