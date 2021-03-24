
class sai67 implements Runnable
{
Thread t;
String name;
	 sai67(String n) throws Exception
    {

		name=n;
		t=new Thread(this,n);
		t.start();




		}
		public void run()
      {

	  for(int i=0;i<=10;i++){p.ptr("inside function() "+name);

	     try{
			   //sleep(10);
			 }catch(Exception e){p.ptr(""+e);}
	  }
}
  public static void main(String aa[]) throws Exception
  {
   sai67 t1=new sai67("User1");
sai67 t2=new sai67("-------------------User2");
sai67 t3=new sai67("User3");
t1.setPriority(9);
t2.setPriority(2);
t3.setPriority(7);

	  for(int i=0;i<=10;i++)
	  {p.ptr("inside MAIN()");}

  }
}
