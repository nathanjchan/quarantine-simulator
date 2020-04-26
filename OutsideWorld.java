import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class OutsideWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OutsideWorld extends World
{

    /**
     * Constructor for objects of class OutsideWorld.
     * 
     */
    public OutsideWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        prepare();
    }
    private void prepare()
    {
        ExitDoor leave = new ExitDoor();
        addObject(leave, 25, 500);
        
        Player noob = new Player();
        addObject(noob, 300, 500);
        
        Coins point = new Coins();
        addObject(point, 1000, 650);
        
        String coinText = "x " + MyWorld.getCoins();

        showText(coinText, 1040, 650);
        
        String question = "Do you have a mask on? y or n";
        showText(question, 600, 375);
        
        //GreenfootImage image = new GreenfootImage("Do you have a mask on?\ny or n", 100, Color.YELLOW, null);
        //getBackground().drawImage(image, 25, 100);

    }
    public void act() 
    {
        String nice = "NICE! You exercised outside and earned 20 Quarantine Coins.";
        if (Greenfoot.isKeyDown("q")) 
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (Greenfoot.isKeyDown("y"))
        {
            showText(nice, 600, 300);
            MyWorld.addCoins(20);
        }
        if (Greenfoot.isKeyDown("n"))
        {
            MyWorld back = new MyWorld();
            Greenfoot.setWorld(back);
        }
    }
}
