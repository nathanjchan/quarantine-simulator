import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BathroomWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BathroomWorld extends World
{

    /**
     * Constructor for objects of class BathroomWorld.
     * 
     */
    public BathroomWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    private void prepare()
    {
        BathroomExitDoor leave = new BathroomExitDoor();
        addObject(leave, 600, 25);
        
        Toilet poop = new Toilet();
        addObject(poop, 150, 150);
        
        Coins point = new Coins();
        addObject(point, 1000, 650);
        
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
        
        Shower hello = new Shower();
        addObject(hello, 600, 600);
        
        Sink wash = new Sink();
        addObject(wash, 1075, 125);
        
        Player noob = new Player();
        addObject(noob, 600, 175);
    }
}
