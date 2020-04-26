import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The background of the actual game.
 * 
 * @author Ethan Chan and Jason Chan 
 * @version Version Alpha
 */
public class OuterSpace extends World
{
    GreenfootSound backgroundMusic = new GreenfootSound("tetris.mp3");
    Ship s;
    Heart h1;
    Heart h2;
    Heart h3;
    /**
     * Creates the space background for the game screen.
     */
    public OuterSpace()
    {    
        super(1200, 750, 1); 
        s = new Ship();
        addObject(s, 600, 650);
        h1 = new Heart();
        addObject(h1, 15, 735);
        h2 = new Heart();
        addObject(h2, 40, 735);
        h3 = new Heart();
        addObject(h3, 65, 735);
        for (int i = 0; i < 12; i++)
            for (int j = 0; j < 3; j++)
            {
                Enemy e = new Enemy();
                addObject(e, 50 + i * 100, 75 + j * 60);
            }
        backgroundMusic.playLoop();
        EnemyRed.enemyCount = 36;
        showText("Press W to fire! Press Q to quit.", 600, 700);
    }

    /**
     * Creates the action to remove lives if you get hit and moves you to the
     * game over screen once you lose all your lives.
     */
    public void act()
    {
        if (s.lives == 2)
            removeObject(h3);
        else if (s.lives == 1)
            removeObject(h2);
        else if (s.lives <= 0)
        {
            removeObject(h1);
            Greenfoot.setWorld(new End());
        }
        if (Greenfoot.isKeyDown("q")) {
            backgroundMusic.stop();
            MyWorld main = new MyWorld();
            Greenfoot.setWorld(main);
        }
    }
}
