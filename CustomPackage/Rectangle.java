package ShapePackage;

import ShapePackage.Shape;

public class Rectangle extends Shape
{
    public Rectangle(int dim1,int dim2)
    {
        super(dim1,dim2);
    }

    public int Area()
    {
        return(this.dim1*this.dim2);
    }

}
