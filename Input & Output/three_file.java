import java.io.*;

class three_file
{
    public static void main(String args[])
    {
        File f1 = new File("D:\\CORE JAVA\\Input & Output");
        File f2 = new File("D:\\CORE JAVA\\Input & Output");
        File f3 = new File("D:\\CORE JAVA\\Input & Output");

        System.out.println("Parent of f2 : "+f2.getParent());
        System.out.println("Existence of f3 : "+f3.getParent());
        System.out.println("Existence of f3 : "+f3.getParent());
         System.out.println("set Readonly to f1 : "+f1.setReadOnly());
        System.out.println("f2 is Directory : "+f2.isDirectory());
        System.out.println("f3 is Directory : "+f3.canWrite());
        System.out.println("Last modifiaction of f2 : "+f2.lastModified());
        System.out.println("Length of f1 : "+f1.length());
        System.out.println("Length of f2 : "+f2.length());
        System.out.println("Length of f3 : "+f3.length());
        System.out.println("Delete : "+f1.delete());
    }
}