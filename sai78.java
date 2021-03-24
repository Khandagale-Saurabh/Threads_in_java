class sai78 extends Thread
{
  public void  run()
  {
    System.out.println(Thread.currentThread().getName());
  }
    sai78(String title)
    {
        System.out.println(title);
    }
  public static void main(String args[])
  {
	 /*Thread t=new Thread("ss");
	 t.run();


      sai78 s1=new sai78("First");
     s1.run();
      sai78 s2 =new sai78("second");
   s2.run();
      sai78 s3 =new sai78("Third");
   s3.run(); */
   Thread n=new Thread("bhnm,");
   n.start();
   n.run();
  }
}