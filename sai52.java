import java.awt.*;
import java.applet.*;
/*
<applet code="sai52"  width=400 height=200>
<param name="param" value="sai">
</applet>
*/
public class sai52 extends Applet
{
	String s;
	   public void init()
	   {
		   setBackground(Color.red);
		   }
		   public void start()
		   {
			 s=getParameter("param");

			}

       public void paint(Graphics ss)
       {
		   sai52 p=new sai52();
		   int p1=change(20);
           ss.drawString("Saurabh",33,33);
           ss.drawString(s,33,33);

       }

       public int change(int a)
       {
		    int range;
		    return a*Random();


		   }

}