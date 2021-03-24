class sai51 extends Thread
{
      sai51(String s)
      {

         System.out.println(Thread.currentThread());
         System.out.println(s);
      }
    public void run()
    {
		  System.out.println(Thread.currentThread());

        System.out.println("Hello");
    }
   public static void main(String aar[])
   {
        sai51 s1=new sai51("First");
        sai51 s2=new sai51("Second");
        sai51 s3=new sai51("Third");

      Thread t1=new Thread(s1,"sksks");
      t1.setPriority(3);
      t1.start();
      Thread t2=new Thread(s2);
      Thread t3=new Thread(s3);

       t2.setPriority(2);
      t2.start();
       t3.setPriority(2);
      t3.start();
   }
}