public class SystemDemo
{
	public static void main(String[] args)
	{
		long time_pre = System.	currentTimeMillis();
		for(int i = 1;i < 10000; i++)
		{
			System.out.print("0 ");
		}
		long time_now = System.currentTimeMillis();
		long time  = time_now-time_pre;
		System.out.println();
		System.out.println(time);
	}
}