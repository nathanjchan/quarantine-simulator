import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Coke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coke extends Actor
{
    /**
     * Act - do whatever the Coke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Coke() 
    {
        GreenfootImage c = new GreenfootImage("coke.png");
        c.scale(100, 100);
        setImage(c);
    }   
    public void act()
    {
        turnAtEdge();
        randomTurn();
        move(5);
    }
    public void turnAtEdge()
    {
        if (isAtEdge())
        {
            turn(17);
        }
    }
    public void randomTurn()
    {
        if (Greenfoot.getRandomNumber(100) > 90)
        {
            turn(Greenfoot.getRandomNumber(90)-45); 
        }
    }
}
