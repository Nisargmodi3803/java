package ShapePackage;

import ShapePackage.Shape;

public class Square extends Shape
{
    public Square(int dim1)
    {
        super(dim1,-1);
    }

    public int Area()
    {
        return(this.dim1*this.dim1);
    }

}
