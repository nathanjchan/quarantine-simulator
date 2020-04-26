import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Strawberry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Strawberry extends Actor
{
    /**
     * Act - do whatever the Strawberry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Strawberry() 
    {
        GreenfootImage a = new GreenfootImage("stawberry.png");
        a.scale(100, 100);
        setImage(a);
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
