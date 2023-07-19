import java.io.*;

class buffered_reader
{
    public static void main(String args[]) throws IOException
	{
		File f = new File("D:\\CORE JAVA\\Input & Output\\f1.txt");
		BufferedReader br = new BufferedReader(new FileReader(f));
		
		//Method-1[using int ]...
		int i;
		
		while((i=br.read())!=-1)
			System.out.print((char)i);

		//Method-2[Using String]...
		String s;

		while((s=br.readLine())!=null)
			System.out.println(s);

		br.close();
	}
}