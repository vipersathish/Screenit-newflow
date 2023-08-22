package sample;

import java.util.HashMap;

public class sample2 {
	
	public static void main(String[] args) {
		
		
		String s = "java program for coding";
		
		
	    HashMap <Character , Integer> map = new HashMap<Character, Integer>();
	    
	    
	    for(int i=0;i<s.length();i++){
	    	
	    	if(map.containsKey(s.charAt(i))){
	    		
	    		int count =  map.get(s.charAt(i));
	    		
	    		map.put(s.charAt(i), count+1);
	    	}else{
	    		
	    		map.put(s.charAt(i), 1);
	    	}
	    }
	    
	    System.out.println(map);
	}

}
