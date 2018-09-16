import java.io.*;
public class ListPrint
{
	public static void main(String[] args)
	{
		File file = new File("D:\\Test");
		listDemo4(file);
	}
	
	public static void listDemo4(File dir)
	{
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
			{
				System.out.println(files[x]);
				listDemo4(files[x]);
			}
			
			else
				System.out.println(files[x] +":::"+ files[x].delete());
		}
		System.out.println(dir.getPath()+"--"+dir.delete());
	}
	
	public static void listDemo3(File dir)//用递归来遍历文件
	{
		File[] files = dir.listFiles();
		for(int x=0;x<files.length;x++)
		{
			if(files[x].isDirectory())
				listDemo3(files[x]);
			else
				System.out.println(files[x]);
		}
	}
	public static void listDemo2()
	{
		File dir = new File("C:/");
		File[] file = dir.listFiles() ;
		for (File f : file)
		{
			System.out.println(f.getPath());
		}
	}
	public static void listDemo1()
	{
		File dir = new File("C:\\");
		
		String[] arr = dir.list(new FilenameFilter()
		{
			public boolean accept(File dir, String name)
			{
				return name.endsWith(".log");
			}
			
		});
		
		for (String f : arr)
		{
			System.out.println(f);
		}
	}
	public static void listDemo()
	{
		File f = new File("C:\\");
		String[] file = f.list();
		
		for(String files : file)
		{
			if(files=="*.log")
				System.out.println(files);
			
		}
	}
}