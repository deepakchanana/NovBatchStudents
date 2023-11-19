package package1;

public class Arithmetic 
{
   public int sum(int a,int b)
   {
	   int c;
	   c=a+b;
	   System.out.println("sum result is "+c);
	   return c;
   }
   public int sub(int x,int y)
   {
	   int z;
	   z=x-y;
	   System.out.println("sub result is "+z);
	   return z;
   }
   public void multi(int x1,int x2)
   {
	   int x3;
	   x3=x1*x2;
	   System.out.println("final result is "+x3);
   }

   public static void main(String[] args) 
   {
	Arithmetic dc=new Arithmetic();
	// classname reference_variable=new classname();
	
	int sumresult=dc.sum(12, 2);  // calling the sum method
	int subresult=dc.sub(12, 2);  // calling the sub method
	dc.multi(sumresult, subresult); // calling the multi method
   }
}
