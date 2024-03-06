package PolymorphismConcepts.com;

public class PolymorphismDemo {
    
	
	
	

	//Polymorphism=-->many+forms
	//Thre are two types of Polymorphism
	//Compile time Polymorphism--->Method Overloading
	//Run Time Polymorphism----Method overriding
	
	
	//Method overloading
	
	//1.Method overloading  will happen in a single class
	//2.Methods name should be same
	
	
	void add(int a,int b)
	{
		int result1=a+b;
		System.out.println(result1);
		
	}
	
	void sub(int a,int b,int c)
	{
		int result2=a-b-c;
		System.out.println(result2);
	}
	
	void mul(int a,int b,int c,int d)
	{
		int result3=a*b*c*d;
		System.out.println(result3);
	}
	
	void per(int a,int b,int c,int d,int e)
	{
		int result4=a%b%c%d%e;
		System.out.println(result4);
	}
	
	
	
	public static void main(String[] args) {
		
		
		PolymorphismDemo obj=new PolymorphismDemo();
		obj.add(5,6);
		obj.sub(5,6,7);
		obj.mul(5,6,7,8);
		obj.per(5,6,7,8,9);
		
		
		
		


	}

}
