import java.io.*;

class MyFileReader
{
	public static void main(String args[]) throws IOException
	{
		FileReader fr = new FileReader("D:\\CORE JAVA\\Input & Output\\f1.txt");
		
		int i;
		
		while((i=fr.read())!=-1)
			System.out.print((char)i);
			
		fr.close();
	}
}