package testJava;

public class SecondLargest {
	
	static int secondLargestOfArray(int []arr) {
		int firstLargest,secondLargest;
		if(arr[0]>arr[1]) {
		 firstLargest=arr[0];
		 secondLargest=arr[1];
		}
		else {
			 firstLargest=arr[1];
			 secondLargest=arr[0];
		}
		for(int i=2;i<arr.length;i++) {
			if(arr[i]>firstLargest) {
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}else if(arr[i]<firstLargest &&arr[i]>secondLargest) {
				secondLargest=arr[i];
			}
		}
		return secondLargest;
	}
	
	public static void main(String[] args) {
		
		System.out.println(secondLargestOfArray(new int[] {1,4,2,42,4,645}));
	}

}
