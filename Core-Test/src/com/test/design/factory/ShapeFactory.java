package com.test.design.factory;

interface Shape
{
    void draw();
}

class Rectangle
    implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square
    implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside Square::draw() method.");
    }
}

class Circle
    implements Shape
{

    @Override
    public void draw()
    {
        System.out.println("Inside Circle::draw() method.");
    }
}

// use getShape method to get object of type shape

/*In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.*/
public class ShapeFactory
{
    public Shape getShape(String shapeType)
    {
        if (shapeType == null)
        {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE"))
        {
            return new Circle();

        }
        else if (shapeType.equalsIgnoreCase("RECTANGLE"))
        {
            return new Rectangle();

        }
        else if (shapeType.equalsIgnoreCase("SQUARE"))
        {
            return new Square();
        }

        return null;
    }
}
