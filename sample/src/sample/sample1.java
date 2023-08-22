package sample;

public class sample1 {
	
	public static void main(String[] args) {
	
		int temp;
		
		int []a = {1,3,5,5,6,3,7,8,8,9,0,0};
		
		for(int i=0;i<a.length;i++){
			
			for(int j=i+1;j<a.length;j++){
				
				if(a[i]<a[j]){
					
					temp =a[i];
					
					a[i]=a[j];
					a[j]= temp;
					
					
					
					
				}
			}
			
			System.out.println(a[i]);
		}
		
		
		
	}

}
