package Inheritanceconcepts.com;




      class Electronics {
    	  
      public Electronics() {
    	  
      System.out.println("Class Electronics");
       }
       public void deviceType() 
       {   
       System.out.println("Device Type: Electronics");
       }
        }
       class Fan extends Electronics {
    	   
       public Fan() {
    	   
       System.out.println("Class Fan");
       
        }
        public void category() {
        	
        System.out.println("Category - TableFan");
        }
       }
       class TableFan extends Fan {
    	   
       public TableFan() {
    	   
       System.out.println("Class TableFan");
        }
       public void Smart_tech() {
    	   
        System.out.println("Fan Technology- SmartFan");
        }
        }
       public class TestingInheritanceconcepts {
    	   
       public static void main(String[] arguments) {
    	   
    	   TableFan obj = new TableFan();
       
            obj.deviceType();
            obj.category();
            obj.Smart_tech();
      
	

	}

}
