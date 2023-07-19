import java.io.*;

class demo
{
    public static void main(String args[])
    {
        File f1 = new File("demo.java");
        File f2 = new File("D:\\CORE JAVA\\Input & Output");

        System.out.println("Name : "+f1.getName());
        System.out.println("Path : "+f2.getAbsolutePath());
    }
}