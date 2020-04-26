import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hand extends Actor
{
    /**
     * Act - do whatever the Hand wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static int count = 9;
    public void act() 
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setRotation(270);
            move(5);
        }
        if (Greenfoot.isKeyDown("a"))
        {   
            setRotation(180);
            move(5);
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setRotation(90);
            move(5);
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setRotation(0);
            move(5);
        }
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("a"))
        {
            setRotation(225);
            move(5);
        }
        if (Greenfoot.isKeyDown("w") && Greenfoot.isKeyDown("d"))
        {
            setRotation(315);
            move(5);
        }
        if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("a"))
        {
            setRotation(135);
            move(5);
        }
        if (Greenfoot.isKeyDown("s") && Greenfoot.isKeyDown("d"))
        {
            setRotation(45);
            move(5);
        }
        if (Greenfoot.isKeyDown("e"))
        {
            if ((isTouching(Apple.class) || (isTouching(Bread.class) || (isTouching(Strawberry.class)
            || (isTouching(Fries.class) || (isTouching(Hamburger.class) || (isTouching(Pie.class)
            || (isTouching(Pizza.class) || (isTouching(Coke.class) || (isTouching(Sprite.class)))))))))))
            {
                removeTouching(Object.class);
                count--;
            }
        }
    }    
    public static int getObjectsEaten()
    {
        return count;
    }
    public static void resetObjectsEaten() {
        count = 9;
    }
}
