import java.io.*;
import java.util.*;

public class IOPro
{
	public static void main(String[] args)throws IOException
	{
		 met2();
	}
	public static void met2()throws IOException
	{
		BufferedReader bufr = new BufferedReader(new FileReader("D:\\Program Files (x86)\\java\\javaÎÄ¼þ¼Ð-s\\day01\\day02\\tx.txt"));
		
		String line = null;
		
		Properties prop = new Properties();
		
		while((line=bufr.readLine() )!=null)
		{
			String[] arr = line.split("=");
			prop.setProperty(arr[0],arr[1]);
			
		}
		System.out.println(prop);
	}
	
	public static void met1()
	{
		Properties prop = new Properties();
		
		prop.setProperty("lisi","123");
		System.out.println(prop);
	}
}