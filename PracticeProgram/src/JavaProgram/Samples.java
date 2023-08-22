package JavaProgram;

public class Samples {
	
	public static void main(String[] args) {
		
		
		String s = "sathish 123";
		
	char[] str =  s.toCharArray();
	
	
	for(int i=0;i<str.length;i++){
		
		   if(Character.isDigit(i)){
			   
			   System.out.println(s.charAt(i));
		   }
	
		
	}
		
		
	

}
}