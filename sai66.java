class p
{
   public static void ptr(String s)
   {
	   System.out.println(""+s);

	   }
	}
class sai66 extends  java.lang.Thread
{
	 sai66()
    {
		start();


		}
		public void run()
      {

	  for(int i=0;i<=10;i++){p.ptr("inside function()");

	     try{
			   //sleep(10);
			 }catch(Exception e){p.ptr(""+e);}
	  }
}
  public static void main(String aa[])
  {
   sai66 t1=new sai66();

	  for(int i=0;i<=10;i++)
	  {p.ptr("inside MAIN()");}

  }
}
