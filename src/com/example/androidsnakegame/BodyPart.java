package com.example.androidsnakegame;

import sofia.graphics.RectangleShape;
import com.example.androidsnakegame.Snake.Direction;
import android.graphics.Point;

/**
 * This class represents each individual bodypart of the snake
 *
 * @author Sachin Yadav (sachin94)
 * @version 2014.04.30
 */
public class BodyPart
{
    private Point          location;
    private Direction      direction;
    private RectangleShape shape;


    // ----------------------------------------------------------
    /**
     * Create a new BodyPart object.
     *
     * @param p
     *            the location of the object
     * @param d
     *            the direction the bodypart will be facing
     */
    public BodyPart(Point p, Direction d)
    {
        location = p;
        direction = d;
        shape = null;
    }


    // ----------------------------------------------------------
    /**
     * Gets the shape object of the bodypart
     *
     * @return the bodypart shape
     */
    public RectangleShape getShape()
    {
        return shape;
    }


    // ----------------------------------------------------------
    /**
     * Sets the shape object of the bodypart
     *
     * @param sh
     *            the shape
     */
    public void setShape(RectangleShape sh)
    {
        shape = sh;
    }


    // ----------------------------------------------------------
    /**
     * Sets the direction the bodypart is facing
     *
     * @param d
     *            the new direction
     */
    public void setDirection(Direction d)
    {
        direction = d;
    }


    // ----------------------------------------------------------
    /**
     * Sets the location of the bodypart
     *
     * @param p
     *            the new point
     */
    public void setLocation(Point p)
    {
        location = p;
    }


    // ----------------------------------------------------------
    /**
     * Sets the location of the bodypart
     *
     * @param x
     *            the x coordinate on the grid
     * @param y
     *            the y coordinate on the grid
     */
    public void setLocation(int x, int y)
    {
        location = new Point(x, y);
    }


    // ----------------------------------------------------------
    /**
     * Gets the direction the bodypart is currently facing
     *
     * @return the direction
     */
    public Snake.Direction getDirection()
    {
        return direction;
    }


    // ----------------------------------------------------------
    /**
     * Gets the current location of the bodypart
     *
     * @return the location
     */
    public Point getLocation()
    {
        return location;
    }
}
