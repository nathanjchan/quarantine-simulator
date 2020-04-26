import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Representation of the title in the Start world.
 * 
 * @author Ethan Chan and jason Chan 
 * @version Version Alpha
 */
public class Title extends Actor
{
    /**
     * Creates and scales the title image.
     */
    public Title()
    {
        GreenfootImage g = new GreenfootImage("title2.png");
        g.scale(1200, 500);
        setImage(g);
    }
}
