package ShapePackage;

import ShapePackage.Shape;

public class Sphere extends Shape
{
    public Sphere(int dim1)
    {
        super(dim1,-1);
    }

    public double Area()
    {
        return(4*Math.PI*this.dim1*this.dim1);
    }

}
