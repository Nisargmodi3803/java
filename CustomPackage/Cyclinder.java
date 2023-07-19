package ShapePackage;

import ShapePackage.Shape;

public class Cyclinder extends Shape
{
    public Cyclinder(int dim1,int dim2)
    {
        super(dim1,dim2);
    }

    public double Area()
    {
        return(2*Math.PI*this.dim1*(this.dim2 + this.dim1));
    }

}