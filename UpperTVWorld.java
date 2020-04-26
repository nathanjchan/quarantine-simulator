
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TVWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UpperTVWorld extends World
{
    /**
     * Constructor for objects of class TVWorld.
     * 
     */
    public UpperTVWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 750, 1);
        showInfo();
        prepare();
    }
    
    private void showInfo()
    {
        String netflixText = "Press 1 to watch Netflix";
        String ps4Text = "Press 2 to play PS4 (not Xbox sorry)";
        String quitText = "Press Q to quit";
        showText(netflixText, 300, 175);
        showText(ps4Text, 300, 200);
        showText(quitText, 300, 225);
    }
    private void removeInfo()
    {
        showText(null, 300, 175);
        showText(null, 300, 200);
        showText(null, 300, 225);
    }
    public void act() 
    {
        if (Greenfoot.isKeyDown("1"))
        {
            removeInfo();
        }
        if (Greenfoot.isKeyDown("2")) {
            removeInfo();
        }
        if (Greenfoot.isKeyDown("q")) {
            UpstairsWorld up = new UpstairsWorld();
            Greenfoot.setWorld(up);
        }
    }
    public void prepare()
    {
        String coinText = "x " + MyWorld.getCoins();
        showText(coinText, 1040, 650);
        Coins point = new Coins();
        addObject(point, 1000, 650);}
}
