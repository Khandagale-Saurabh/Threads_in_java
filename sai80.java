class sai80 extends Thread
{


	      public void run()
	      {

	   System.out.println(Thread.currentThread());
          }

  public static void main(String args[])
  {

   sai80 s1=new sai80();

   sai80 s2=new sai80();


   sai80 s3=new sai80();

   sai80 s4=new sai80();

   sai80 s5=new sai80();

  Thread t1=new Thread(s1,"1st");

  Thread t2=new Thread(s2,"2nd");


  Thread t3=new Thread(s2,"3rd");

  Thread t4=new Thread(s2,"4th");

  Thread t5=new Thread(s2,"5th");

  try
  {
     t1.setPriority(1);
     t2.setPriority(1);
     t3.setPriority(3);
     t4.setPriority(2);

     t5.setPriority(6);
     t2.start();
   t1.start();

   t3.start();
   t4.start();
   t2.start();
}
catch(Exception ee)
{
	}

   //  t3.setPriority(2);


	//   System.out.println(t1.setPriority(3));

}
}