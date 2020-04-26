import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorkingWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorkingWorld extends World
{

    /**
     * Constructor for objects of class WorkingWorld.
     * 
     */
    public WorkingWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1); 
        prepare();
    }
    public void act()
    {
        String correct = "CORRECT!";
        String wrong = "WRONG!";
        if (Greenfoot.isKeyDown("q")) {
            UpstairsWorld up = new UpstairsWorld();
            Greenfoot.setWorld(up);
        }
        if (Greenfoot.isKeyDown("a"))
        {
            showText(wrong, 600, 300);
        }
        if (Greenfoot.isKeyDown("b"))
        {
            showText(correct, 600, 300);
            MyWorld.addCoins(10);
            WorkingWorld2 question = new WorkingWorld2();
            Greenfoot.setWorld(question);
        }
        if (Greenfoot.isKeyDown("c"))
        {
            showText(wrong, 600, 300);
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
        
        String interactText = "1) 2x + 7 = 35";
        String choice1 = "a) 21";
        String choice2 = "b) 14";
        String choice3 = "c) 28";
        String choice4 = "d) 26";
        
        showText(interactText, 600, 375);
        showText(choice1, 600, 400);
        showText(choice2, 600, 425);
        showText(choice3, 600, 450);
        showText(choice4, 600, 475);
        showText("Answer the questions correctly with the right key for Quarantine Coins! Press Q to quit.", 600, 700);
        
    }
}
