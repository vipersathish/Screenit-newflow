package JavaProgram;

import java.util.HashMap;
import java.util.Map;

public class NumberProgram {
	
	public static void main(String[] args) {
		
	
//		String s = "sathish";
//		
//		String s1 = "kumar" ; 
//	
//		
//		s = s+s1 ;
//		
//   s1 =	 s.substring(0,s.length() - s1.length());
//   
//   s = s.substring(s1.length());
//   
//  
//   
//   System.out.println(s+" "+s1);
   
		
		String s = "a1b2c3";
		
		for(int i=0;i<s.length();i++){
			
			if(Character.isAlphabetic(s.charAt(i))){
				
				System.out.print(s.charAt(i));
			}else{
				
				int n = Character.getNumericValue(s.charAt(i));
				
				for(int j=0;j<n;j++){
					
					System.out.print(s.charAt(i-1));
					
				}
			}
			
		}
		
		
	
		
	}
}
