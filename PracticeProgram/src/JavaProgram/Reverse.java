package JavaProgram;

import java.util.concurrent.SynchronousQueue;

public class Reverse {
	
	
	public static void main(String[] args) {
//		
//		String s = "sathish";
//		
//        String se = "kumar";
//		
////		for(int i = s.length()-1;i>=0;i--){
////			
////			rev = rev +" "+ s.charAt(i);
////			
////		//	System.out.print(rev);
////		}
////		System.out.print(rev);
//		
//		
//		s = s+se ;
//		
//		
//		se = s.substring(0,s.length()-se.length());
//		
//		s = s.substring(se.length());
//		
//		
//		System.out.println(s+ "   "+se);
//		
		
		int first = 0;
		
		int sec = 1;
		
		int result ;
		
		for(int i =0;i<20;i++){
			
			result = first+sec;
			
			first = sec ;
			
			sec = result ;
			
		}
	
		System.out.println(sec);
		
		
		
		
		
		
		
	}

}
