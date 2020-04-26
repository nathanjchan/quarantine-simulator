import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class washing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WashingWorld extends World
{

    /**
     * Constructor for objects of class washing.
     * 
     */
    public WashingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    public void act() {
        if (Greenfoot.isKeyDown("q")) {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (HandTwo.getObjectsCollected() == 0)
        {
            HandTwo.resetObjectsCollected();
            WinWorld koo = new WinWorld();
            Greenfoot.setWorld(koo);
        }
    }
    public void prepare()
    {
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
        Coins point = new Coins();
        addObject(point, 1000, 650);
        washhand1 a = new washhand1();
        addObject(a, 100, 200);

        washhand2 b = new washhand2();
        addObject(b, 500, 200);

        washhand3 c = new washhand3();
        addObject(c, 900, 200);

        washhand4 d = new washhand4();
        addObject(d, 100, 400);

        washhand5 e = new washhand5();
        addObject(e, 500, 400);

        washhand6 f = new washhand6();
        addObject(f, 900, 400);

        washhand7 g = new washhand7();
        addObject(g, 100, 600);

        washhand8 h = new washhand8();
        addObject(h, 500, 600);
        
        HandTwo hand = new HandTwo();
        addObject(hand, 200, 200);
        
        showText("Press E to collect hand washing steps. Press Q to quit.", 600, 700);
    }
    
}
