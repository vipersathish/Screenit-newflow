package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class Excesice {
	
	
	
	public static void main(String[] args) {
		
		
	String s = "sathish kumar sathish 1 1 1 222222 4567 2 4556 fdghy dtf d"	;
	
	String [] s1 = s.split(" ");
	
	
	Map<String,Integer> m = new HashMap<String,Integer>();
	
	for(String c:s1){
		
		if(m.containsKey(c)){
			
			m.put(c, m.get(c)+1);
		}else{
			
			m.put(c, 1);
		}
	}
	
	System.out.println(m);
}
}