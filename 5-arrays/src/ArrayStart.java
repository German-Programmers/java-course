

public class ArrayStart {
	public static void main(String[] args) {
		int[] arr = {5, 9, 8, -2, 8, 10};
		System.out.println(arr[5]);
		System.out.println(arr.length);
		
		System.out.println("//////////////");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("//////////////");
		
		// code here
		// print sum the numbers inside the arr
		
		int storage = 0;
		
		for (int i = 0; i < arr.length; i++) {
			storage += arr[i];
			// storage = storage + arr[i];
		}
		System.out.println(storage);
		
		System.out.println("//////////////");
		
		//code here 
		//print max number in arr
		
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
		System.out.println("//////////////");
		//code here 
		//print min number in arr
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println(min);
		System.out.println("//////////////");
		//code here 
		//print only odd numbers in the arr
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
			}
		}
		
		// homework
		// 1- print arr element exactly like this
		// 5, 9, 8, -2, 8, 10
		
		// 2- print the average of arr elements
		System.out.println("//////////////");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length - 1)
			System.out.print(", ");
			else
				System.out.println();
		}
		System.out.println("//////////////");
		// howmwork 2
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		System.out.println(sum / arr.length);
		
	}

}
