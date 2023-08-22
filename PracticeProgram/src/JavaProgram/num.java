package JavaProgram;

public class num {
	
	public static void main(String[] args) {
		
		
		
		
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
