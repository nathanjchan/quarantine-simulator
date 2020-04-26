import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorkingWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorkingWorld2 extends World
{

    /**
     * Constructor for objects of class WorkingWorld2.
     * 
     */
    public WorkingWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    public void act()
    {
        String display = "You earned 10 Quarantine Coins for getting 1) right. Press Q to quit.";
        showText(display, 600, 275);
        String correct = "CORRECT!";
        String wrong = "WRONG!";
        if (Greenfoot.isKeyDown("q")) 
        {
            UpstairsWorld up = new UpstairsWorld();
            Greenfoot.setWorld(up);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            showText(wrong, 600, 300);
        }
        if (Greenfoot.isKeyDown("b"))
        {
            showText(wrong, 600, 300);
        }
        if (Greenfoot.isKeyDown("c"))
        {
            showText(correct, 600, 300);
            MyWorld.addCoins(10);
            WinWorld win = new WinWorld();
            Greenfoot.setWorld(win);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            showText(wrong, 600, 300);
        }
    }
    public void prepare()
    {
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
        
        Coins point = new Coins();
        addObject(point, 1000, 650);
        
        String interactText = "2) 48x / 6 = 5x - 6";
        String choice1 = "a) -6/13";
        String choice2 = "b) 2";
        String choice3 = "c) -2";
        String choice4 = "d) 13";
        
        showText(interactText, 600, 375);
        showText(choice1, 600, 400);
        showText(choice2, 600, 425);
        showText(choice3, 600, 450);
        showText(choice4, 600, 475);
        
    }
}
