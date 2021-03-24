class  sai74 extends Thread
{

    sai74(String s)
    {
     start();
    }


   public void run()
   {
   for( int i=0;i<10;i++)
        {
          System.out.println("Inside run()");
                                 try
				       {
				         Thread.sleep(1000);
				       }
				       catch(Exception e)
				       {
				        }
        }
   }

 public static void main(String aaa[])
 {
     sai74 s=new sai74();
          s.dd("first");


	      sai74 s1=new sai74();
          s1.dd();
     sai74 s2=new sai74();
          s2.dd();
     for(int i=0;i<=10;i++)
     {
       System.out.println("Inside main()");
      try
      {
        Thread.sleep(1000);
      }
      catch(Exception e)
      {

      }

     }
 }
}