class Rectangle
{
    int length,breadth;

    Rectangle(int l,int b)
    {
        this.length = l;
        this.breadth = b;
    }

    int Area()
    {
        return(length*breadth);
    }
}

class Cuboid extends Rectangle
{
    int height;

    Cuboid(int h)
    {
        super(10,20);

        this.height = h;
    }

    int Volume()
    {
        return(length*breadth*height);
    }
}

class Rectangle_Cuboid
{
    public static void main(String args[])
    {
        Rectangle R = new Rectangle(10,20);
        Cuboid C = new Cuboid(30);
        System.out.println("Area of Rectangle : "+C.Area());
        System.out.println("Volume of Cuboid : "+C.Volume());
    }
}