package CollectionsDemo.com;



	import java.util.HashMap;

	public class MapConcept {

		public static void main(String[] args) {
			
			HashMap<String,Integer> omap=new HashMap<String,Integer>();
			
			omap.put("Riyansh", 20);
			omap.put("Kishore", 22);
			omap.put("Praveen", 25);
			omap.put("Sheryansh", 23);
			omap.put("candy", 12);
			System.out.println(omap.size());
			System.out.println("Printing all the values");
			
			for(String names:omap.keySet())
			{
				System.out.println(omap.get(names));
				
			}
			System.out.println("Getting the values based the key");
			
			System.out.println(omap.get("Riyansh"));
			System.out.println(omap.get("Praveen"));
			
			
			if(omap.containsValue(200))
			{
				System.out.println("This is the value of akhila");
			}
			
			System.out.println("Thanks");
			
			omap.remove("Kishore");
			System.out.println(omap.size());
			
			
	}

}
