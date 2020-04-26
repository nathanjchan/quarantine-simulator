import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Used an image to represent the amount of lives the player has
 * 
 * @author Ethan Chan an Jason Chan 
 * @version Version Alpha
 */
public class Heart extends Actor
{
    public Heart()
    {
        GreenfootImage g = new GreenfootImage("life.png");
        g.scale(20, 20);
        setImage(g);
    }
}
