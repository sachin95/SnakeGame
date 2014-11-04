package com.example.androidsnakegame;

import sofia.graphics.Color;
import sofia.graphics.RectangleShape;
import android.graphics.Point;
import java.util.Random;

/**
 * This class represents the mouse that the snake eats to get bigger
 *
 * @author Sachin Yadav (sachin95)
 * @version 2014.04.30
 */
public class Mouse
{
    private Point          random;
    private RectangleShape shape;


    // ----------------------------------------------------------
    /**
     * Create a new Mouse object.
     *
     * @param gridSize
     *            size of the grid
     * @param snake
     *            the snake object that is represented on the screen
     * @param cellSize
     *            the size of each cell of the grid
     */
    public Mouse(int gridSize, Snake snake, float cellSize)
    {
        Random rand = new Random();
        random = new Point(rand.nextInt(gridSize), rand.nextInt(gridSize));

        while (snake.containsPoint(random))
        {
            random = new Point(rand.nextInt(gridSize), rand.nextInt(gridSize));
        }

        float x = random.x * cellSize;
        float y = random.y * cellSize;

        shape = new RectangleShape(x, y, x + cellSize, y + cellSize);
        shape.setFillColor(Color.white);
    }


    // ----------------------------------------------------------
    /**
     * Gets the current location of the mouse
     *
     * @return the location
     */
    public Point getLocation()
    {
        return random;
    }


    // ----------------------------------------------------------
    /**
     * Gets the shape object of the mouse
     *
     * @return the shape object
     */
    public RectangleShape getShape()
    {
        return shape;
    }

}
