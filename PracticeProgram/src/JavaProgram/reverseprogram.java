package JavaProgram;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class reverseprogram {
	
	
   public static void main(String[] args) {
	
	
	  String s = "sathish kumar 1233" ;
	  
	  
	 char [] str =      s.toCharArray();
	 

	 Set sets  = new TreeSet();
	 
	 for(int i=0;i<str.length;i++){
	 
	 sets.add(str[i]);
	 
	 }
	 
	 Iterator<Character> it = sets.iterator();
	 
	 while(it.hasNext()){
		 
		 System.out.print(it.next());
	 }
	
   }
   
}

