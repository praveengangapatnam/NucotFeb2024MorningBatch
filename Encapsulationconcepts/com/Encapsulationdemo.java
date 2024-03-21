package Encapsulationconcepts.com;

public class Encapsulationdemo {

	
		

	String name="naveen";
	int account_number=12345;
	private int atmpin=1111;
	
	public int getAtmpin() {
		return atmpin;
	}


	public void setAtmpin(int atmpin) {
		this.atmpin = atmpin;
		System.out.println(this.atmpin);

	}	
		
	public static void main(String[] args) {
		
		Encapsulationdemo  obj=new Encapsulationdemo();
		System.out.println(obj.name);
		System.out.println(obj.account_number);
		System.out.println(obj.atmpin);
		
		
		String name=obj.name="sreyansh";
		System.out.println(name);
		
		int acc=obj.account_number=12345;
		System.out.println(acc);
		
		int atm=obj.atmpin=3333;
		System.out.println(atm);
		
		

	}

}