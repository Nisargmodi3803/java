class A
{
    public int a;

    A()
    {
        System.out.println("Class A Default Constructor");
    }
    A(int a)
    {
        this.a = a;
        System.out.println("Class A Parametized Constructor");
    }

    public void method()
    {
        System.out.println("Class A Method");
    }
}

class B extends A
{
    B()
    {
        System.out.println("Class B Default Constructor");
    }
    B(int a)
    {
        this.a = a;
        System.out.println("Class B Parameterized Constructor");
    }

    @Override
    public void method()
    {
        System.out.println("Class B Method");
    }
}

class override
{
    public static void main(String args[])
    {
        A a = new A(10);
        // B b = new B();
        A b = new B(20);

        a.method();
        b.method();
    }
}