package Problem3;

import java.util.Arrays;

public class Problem3 {

	public static void main(String[] args) {
		int  num = 30;
		int arr[] = new int[100];

		for (int i = 1; i <= num; i++){

			if(num % i == 0){
				int k = 0;
				int temp = i; 
				
				arr[k] = i; 
				
				k++;
			}
		
		}

		Arrays.sort(arr);
		
		System.out.println(arr[0]);
	}


}
