import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class eatTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Table extends Actor
{
    /**
     * Act - do whatever the eatTable wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Table()
    {
        GreenfootImage tables = new GreenfootImage("eatTable.png");
        tables.scale(200, 200);
        setImage(tables);
    }    
}
