import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private static int coinAmount = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        prepare();
    }

    private void prepare()
    {
        Sink whew = new Sink();
        Table eat = new Table();
        Stairs up = new Stairs();
        TV watch = new TV();
        Door entrance = new Door();
        Player person = new Player();
        Coins point = new Coins();
        Refrigerator freeze = new Refrigerator();
        Stove heat = new Stove();
        BathroomDoor hi = new BathroomDoor();
         
        addObject(hi, 600, 735);
        addObject(freeze, 1125, 100);
        addObject(heat, 750, 125);
        addObject(whew, 950, 100);
        addObject(eat, 100, 375);
        addObject(up, 60, 680);
        addObject(watch, 100, 75); 
        addObject(entrance, 1225, 500);
        addObject(person, 600, 375);
        addObject(point, 1000, 650);

        String coinText = "x " + coinAmount;
        String interactText = "Press E to interact with objects";
        String quitText = "Press Q to exit any minigame";

        showText(coinText, 1040, 650);
        showText(interactText, 500, 10);
        showText(quitText, 500, 30);
    }

    public void act() {
        if (Greenfoot.isKeyDown("e")) {
            showText(null, 300, 10);
        }
        if (Greenfoot.isKeyDown("q")) {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
    }

    public static int getCoins() {
        return coinAmount;
    }

    public static void addCoins(int num) {
        coinAmount += num;
    }
}
