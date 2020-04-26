import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
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
        if (isTouching(Sink.class) && Greenfoot.isKeyDown("e"))
        {
            WashingWorld gameOne = new WashingWorld();
            Greenfoot.setWorld(gameOne);
        }
        if (isTouching(Stairs.class)) 
        {
            UpstairsWorld upperLvl = new UpstairsWorld();
            Greenfoot.setWorld(upperLvl);
        }
        if (isTouching(Table.class) && Greenfoot.isKeyDown("e"))
        {
            EatingWorld eating = new EatingWorld();
            Greenfoot.setWorld(eating);
        }
        if (isTouching(Desk.class) && Greenfoot.isKeyDown("e"))
        {
            WorkingWorld working = new WorkingWorld();
            Greenfoot.setWorld(working);
        }
        if (isTouching(ExitStairs.class))
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (isTouching(Door.class))
        {
            OutsideWorld out = new OutsideWorld();
            Greenfoot.setWorld(out);
        }
        if (isTouching(TV.class) && Greenfoot.isKeyDown("e"))
        {
            OuterSpace tv = new OuterSpace();
            Greenfoot.setWorld(tv);
        }
        if (isTouching(ExitDoor.class))
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (isTouching(Bed.class) && Greenfoot.isKeyDown("e"))
        {
            SleepingWorld sleep = new SleepingWorld();
            Greenfoot.setWorld(sleep);
        }
        if (isTouching(Closet.class) && Greenfoot.isKeyDown("e"))
        {
            ClosetWorld clothes = new ClosetWorld();
            Greenfoot.setWorld(clothes);
        }
        if (isTouching(BathroomDoor.class))
        {
            BathroomWorld hole = new BathroomWorld();
            Greenfoot.setWorld(hole);
            setRotation(90);
        }
        if (isTouching(BathroomExitDoor.class))
        {
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
        if (isTouching(Stove.class) && Greenfoot.isKeyDown("e"))
        {
            StoveWorld heat = new StoveWorld();
            Greenfoot.setWorld(heat);
        }
        if (isTouching(Shower.class) && Greenfoot.isKeyDown("e"))
        {
           ShowerWorld heat = new ShowerWorld();
            Greenfoot.setWorld(heat);
        }
        if (isTouching(Toilet.class) && Greenfoot.isKeyDown("e"))
        {
            ToiletWorld heat = new ToiletWorld();
            Greenfoot.setWorld(heat);
        }
        if (isTouching(Refrigerator.class) && Greenfoot.isKeyDown("e"))
        {
            RefrigeratorWorld freeze = new RefrigeratorWorld();
            Greenfoot.setWorld(freeze);
        }
    }

}
