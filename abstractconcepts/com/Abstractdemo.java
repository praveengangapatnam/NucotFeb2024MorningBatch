package abstractconcepts.com;

public abstract class Abstractdemo {

	//we cannot create object for abstract class
	//implemented and un-implemented
	
	//method def--implemented method
	void userNameField()
	{
		System.out.println("userNameField");
	}
	
	//method def--implemented method
	void passWordField()
	{
		System.out.println("passWordField");
	}
	
	abstract void loginBtn();//prototype//method declaration//un-implemented method


}


class AbstractDemo2 extends Abstractdemo
{
	
	
	void loginBtn()
	{
		System.out.println("loginBtn");
	}
	
	
	
	

}
