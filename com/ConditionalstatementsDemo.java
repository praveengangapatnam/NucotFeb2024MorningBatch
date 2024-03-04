package javasessions.com;

public class ConditionalstatementsDemo {

	public static void main(String[] args) {
		
		
		int a=4;
		int b=5;
		System.out.println("which is the greatest of two numbers");
		
		//syntax
		/*
		 * if(condition)
		 * {
		 * 
		 * 
		 *                statement
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 */

		if(a>b)
		
		{
		       System.out.println("a is greater than b");
		} 
		       
		       System.out.println("Thanks");
		  
		       
		 //if else
		 //syntax
		 /*
		  * if(condition)
		  * {
		  * 
		  * }
		  * else
		  *{
		  *
		  * 
		  *} 
		  */
		 
		   int p=10;
		   int q=8;
		   
		   if(p>q);
		             {
			              System.out.println("p is agreater than q");
		             }
		   else 
		              {
			               System.out.println("q is greater than p");
		               }
		                   System.out.println("");
		   
		                   System.out.println("using Nested if");
		
		   if(p>q);
		              {
		                   System.out.println("p is greater than q");
		                  if(q>p);
		                  {		                  
		                    System.out.println("q is greater than p");
		                  }
		               }
		   
		   
		   
		}
	
		
		
	}	
		
		
		
	


