package javasessions.com;

public class ConditionalstatementsDemo {

	public static void main(String[] args) {
		

		// Conditional Statements
		// if
		// if else
		// Nested if 
		// Nested if else
		
		
		// to find the greatest of 2 Integers
		int a=8;
		int b=10;
		int p=8;
		int q=10;

			System.out.println(a);
			System.out.println(b);

			System.out.println("Using if");
			
				if(a>b)

					{
						System.out.println("'a' is greater than b");
					}
				//if condition is not met, it will not print any error
					System.out.println("");
			
			System.out.println("Using if-else");
				if(p>q)

					{
						System.out.println("'p' is greater than q");
					}
				else
					{
						System.out.println("'q' is greater than p");
					}
			
				System.out.println("");
			
			System.out.println("Using Nested if");
					if(p>q)
	
						{
							System.out.println("'p' is greater than q");
							if(q>p)
								{
									System.out.println("'q' is greater than p");
								}
						}
				
					System.out.println("");
			
		
		
		
		
	}
		
		
		
	

}
