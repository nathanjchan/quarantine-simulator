import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EatingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EatingWorld extends World
{
    /**
     * Constructor for objects of class EatingWorld.
     * 
     */
    public EatingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("q")) {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (Hand.getObjectsEaten() == 0)
        {
            Hand.resetObjectsEaten();
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

        Apple a = new Apple();
        addObject(a, 100, 200);

        Bread b = new Bread();
        addObject(b, 500, 200);

        Strawberry c = new Strawberry();
        addObject(c, 900, 200);

        Fries d = new Fries();
        addObject(d, 100, 400);

        Hamburger e = new Hamburger();
        addObject(e, 500, 400);

        Pie f = new Pie();
        addObject(f, 900, 400);

        Pizza g = new Pizza();
        addObject(g, 100, 600);

        Coke h = new Coke();
        addObject(h, 500, 600);

        Sprite i = new Sprite();
        addObject(i, 900, 600);

        Hand hand = new Hand();
        addObject(hand, 600, 700);
        
        showText("Press E to eat food. Press Q to quit.", 600, 700);
    }

}
