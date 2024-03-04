package javasesssions.com;

public class Loops {

	public static void main(String[] args) {
	
		//types of loops
		
		//while loop
		//do while loops
		//for loops
		//for each loops
		
		//while loop-->minimum number of times while will execute-->0
		/*
		 * syntax
		 * while(condition)
		 *{ 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 */
		System.out.println("numbers from 0 to 10");
			
		int i=0;
		while(i<=10);  {
		
		System.out.println(i);
		//0,1,2,3,4,5,6,7,8,9,
         i++;
         //i+0=1,2,3,4,5,-----
         System.out.println("while loop ends when the number is greater than 10 ");
          
		}
		int ii=1;
		while(ii<10);
		{
		System.out.println(ii);
		System.out.println("while loop ends when the number is greater than 10 ");
		}
		
		//syntax
		/* do
		 * {
		 *   body or statement
		 * } while(condition)
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		System.out.println("program using 'do while loop to get numbers less than 10");
		
		    int num1=2;
		    do
		       {
		         System.out.println(num1);
		         num1++;
		       }while(num1<=2);
		 System.out.println("do while loop ends when the number 1 is greater than 10");
		 
		   int num2=6;
		   do
		   { 
			   System.out.println(num2);
			   num2++;
		   }while(num2<=10);
		   System.out.println("do while loop ends when the number 1 is greater than 10");
		
		
		  //syntax
		  //for(variable_initialization;variable_conition;variable_updation(++/--))
		  /*{
		   * 
		   *       body or statements
		   * }
		   * 
		   * 
		   * 
		   */
		
		
		 System.out.println("program using 'for loop' to get numbers less than 10 ");
		 	
		 for(int b=5;b<10;b++);
		 {
			System.out.println('b');
			
			 }
		System.out.println("for loop ends when the number 5 is greater than 10");
		
		
		  for(int bb=4;bb<=10;bb=bb+2);
		  {
		System.out.println("b");
		  }
		
		  //
		  
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
