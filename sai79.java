class sai79 implements Runnable
{
int i;

  public void run()
  {
	  System.out.println(Thread.currentThread());

    for(i=0;i<10;i++)
    {
      try
       {


        if(i%2.0==0)
        {
        System.out.println("Even"+i);
        Thread.sleep(1000);


        }
        else
        {
          System.out.println(i+"=Odd");
         Thread.sleep(1000);
         }
       }
         catch(Exception e)
         {
           System.out.println("Sleep()");
         }



    }


  }


  public  static void main(String a[])
  {
	    Thread tt=new Thread();
	    System.out.println(" "+Thread.currentThread());

        sai79 m=new sai79();
        sai79 nn=new sai79();
        Thread t1=new Thread(m,"First");
        Thread t2=new Thread(nn,"Second");
        t1.setPriority(3);
        t2.setPriority(5);
t1.start();
t2.start();


  }
}