package Classesandobjects.com;

public class ConstructorclassDemo {
	
	
	
	
	//1.Constructor name should be always same as class name
			//2.Constructor are called when you create Object 
			//3.Constructor are mainly used to initialize data and objects
			//4.We have two types one is default constructor
			//5.Parameterized constructor
			//6.Constructor don't have return type
	 
		//Java Program to demonstrate the use of the parameterized constructor.
	         {
		  }
	         
	         
	         int a;
	     	String names;

	     	
	     	ConstructorclassDemo()
	     	{
	     		System.out.println("default constructor");
	     	
	     	}
	         
	         
		  int id;
		  
		  String name;
		  
		  double fees;
		  
		  //creating a parameterized constructor
		  
		  ConstructorclassDemo(int i,String n,double f){
			  
		  id = i;
		  name = n;
		  fees=f;
		  }
		  //method to display the values
		  
		  void show()
		   {
		   System.out.println(id+" "+name+fees);
		   }
		  
		  public static void main(String args[]){
			  
		  //creating objects and passing values
			  
		  ConstructorclassDemo obj1 = new ConstructorclassDemo(123,"Mahesh",50000);
		  ConstructorclassDemo obj2 = new ConstructorclassDemo(321,"Mukesh",50000);
		  ConstructorclassDemo obj3 = new ConstructorclassDemo(111,"Naveen",50000);
		  ConstructorclassDemo obj4 = new ConstructorclassDemo(456,"Riyansh",50000);
		  
		  
		  //calling method to display the values of object
		  
		   obj1.show();
		   obj2.show();
           obj3.show();
		   obj4.show();
		  
		  
		  
		  
		  
		
	}

}
