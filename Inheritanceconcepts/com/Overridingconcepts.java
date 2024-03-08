
package Inheritanceconcepts.com;

   class Employee
   {
      void Show()
      {
      System.out.println("This is show in  Employee ");
      }
      void show1()
      {
      System.out.println("This is show1 in  Employee Name");
      }
   }
     class Manager extends Employee
     {
       void Show2()
       {
    	   System.out.println("This is  Show2 in  Manager");
       }
       void Shoe3()
       {
    	   System.out.println("This is  Show3 in Manager Name");
       }
     }
   

public class Overridingconcepts {

	public static void main(String[] args) {
		 
		Employee obj = new Employee();
		
		  obj.Show();
		  obj.show1();
		  
		 Manager obj1 = new Manager();
				 
		    obj1.Show2();
		    obj1.Shoe3();
		  
		  
		  
		  
		  
		

	}

}
