package package1;

public class Student // ClassName---Student
{  // { } indicate the boundary(body) of the class 
 int a=4442;  // a is a variable that will store integer value
 public void deepak()  // method name--deepak () indicate method
 {   // { } indicate the boundary of the method
	 System.out.println("Welcome to all of you");
 }
 public static void main(String[] args) 
 {
	Student paras=new Student(); // classname refervar=new classname();
	paras.deepak();  // calling the method--deepak
	System.out.println("value of a "+paras.a);
	paras.a=4; // calling the variable---a
	System.out.println("value of a "+paras.a);	
	paras.a=544444;
	System.out.println("value of a "+paras.a);
 }
	
}
