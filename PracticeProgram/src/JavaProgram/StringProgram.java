package JavaProgram;

import java.util.HashMap;

public class StringProgram {
	
	
	public static void main(String[] args) {
		
		
		
		String s = "sa   thish ku  m     12233  @!@!)  ar" ;
		
	char [] str = 	s.toCharArray();
		
		
		for(int i=0;i<str.length;i++){
			
			if(str[i] != ' ' && Character.isLetterOrDigit(str[i])){
				
		
			
			}else{
				
				if(str[i] !=' '){
					
					System.out.println(str[i]);
				}
				
			}
			
		}
	
		
		
	}
	
	
	

}
