package PolymorphismConcepts.com;

public class Methodoverloading {

	
	  void multiply(int a, int b)
	  {
	    System.out.println("Result is"+(a*b)) ;
	  }
	  void multiply(int a, int b, int c)
	  {
	    System.out.println("Result is"+(a*b*c));
	  }
	  
	  void multiply(double a, double b,double c, double d)
	  {
		    
		System.out.println("Result is "+(a*b*c*d));  
	  }
	  void multiply(double a, double b,double c, double d, double e)
	  {
		 System.out.println("Result is"+(a*b*c*d*e));
	  }
	public static void main(String[] args) {
		
	     Methodoverloading  obj = new Methodoverloading();
	    	 
	 	    obj.multiply(8,5);   
	 	    obj.multiply(8,5,2);  
	 	    obj.multiply(4,6,5,7);
            obj.multiply(5,8,9,6,7);
	}

}
