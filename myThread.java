

class myThread extends Thread
{
public 	void run()
	{
		System.out.println(""+Thread.currentThread().getName());
		}
   public static void main(String a[])
   {
	   System.out.println(" "+Thread.currentThread().getName());
	   myThread th=new myThread();

	   th.start();
	   th.setName("run method()");
	   th.run();



	   th.setName("User define()");
	   th.run();
	   }
}
