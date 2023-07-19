import java.util.*;

class Circle 
{
    int radius;

    Circle(int r)
    {
        this.radius = r;
    }

    double Area()
    {
        return(Math.PI*radius*radius);
    }
    
}

class Cylinder extends Circle
{
    int height;

    Cylinder(int h)
    {
        super(10);
        this.height = h;
    }

    double Volume()
    {
        return(Math.PI*radius*radius*height);
    }
}


class Circle_Cylinder
{
    public static void main(String args[])
    {
        Circle C = new Circle(10);
        // System.out.println("Area of Circle = "+C.Area());

        Cylinder Cy = new Cylinder(20);
        System.out.println("Volume of Cylinder = "+Cy.Volume());
        System.out.println("Area of Circle = "+Cy.Area());

        Circle c = new Cylinder(20);
        // System.out.println("Volume of Cylinder = "+c.Volume());  // We Cannot do this...
        System.out.println("Area of Circle (Dynammic binding) = "+c.Area());
    }
}