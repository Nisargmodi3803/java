import ShapePackage.Rectangle;
import ShapePackage.Square;
import ShapePackage.Circle;
import ShapePackage.Cyclinder;
import ShapePackage.Sphere;

public class ImplementShape 
{
    public static void main(String[] args) throws Exception
    {
        Rectangle r = new Rectangle(5, 3);
        System.out.println("Rectangle dim1 = "+r.getDim1());
        System.out.println("Rectangle dim2 = "+r.getDim2());
        r.setDim1(6);
        System.out.println("Rectangle dim1 = "+r.getDim1());
        System.out.println("Rectangle Area = "+r.Area());

        System.out.println();

        Square s = new Square(5);
        System.out.println("Square Dim1 = "+r.getDim1());
        s.setDim1(6);
        System.out.println("Square Dim1 = "+r.getDim1());
        System.out.println("Square Area = "+s.Area());

        System.out.println();

        Circle c = new Circle(3);
        System.out.println("Circle Radius = "+c.getDim1());
        c.setDim1(4);
        System.out.println("Circle Radius = "+c.getDim1());
        System.out.println("Cicle Area = "+c.Area());

        System.out.println();

        Cyclinder cy = new Cyclinder(3, 10);
        System.out.println("Cyclinder Radius = "+cy.getDim1());
        System.out.println("Cyclinder Height = "+cy.getDim2());
        cy.setDim1(4);
        System.out.println("Cyclinder Radius = "+cy.getDim1());
        System.out.println("Cylinder Area = "+cy.Area());

        System.out.println();

        Sphere sh = new Sphere(3);
        System.out.println("Spere Radius : "+sh.getDim1());
        sh.setDim1(4);
        System.out.println("Spere Radius : "+sh.getDim1());
        System.out.println("Sphere Area : "+sh.Area());

        System.out.println();
    }
}
