package ShapePackage;

import ShapePackage.Shape;

public class Circle  extends Shape
{
    public Circle(int dim1)
    {
        super(dim1,-1);
    }

    public double Area()
    {
        return(Math.PI * this.dim1 * this.dim1);
    }

}