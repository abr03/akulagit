import java.util.LinkedHashMap;
import java.util.Map;

public class Duplicate {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Selenium in Java";


        Map<Character, Integer> name= new LinkedHashMap<Character,Integer>();
        char[] c = str.toCharArray();
        
        for(char i: c) {
        	
        	if(name.containsKey(i))
        	{
            	name.put(i, name.get(i)+1);
            	

        	}
        	else {
        		name.put(i, 1);
        	}
        
        }
    	System.out.println(name);
        

}
}
