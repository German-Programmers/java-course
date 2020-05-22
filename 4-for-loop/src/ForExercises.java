
public class ForExercises {
	public static void main(String[] args) {
		// print odd numbers between 0 and 10
		for (int i = 1; i <= 10; i += 2) {
			System.out.println(i);
			
		}
		
		System.out.println("=============================");
		// print even numbers between 0 and 10
				for (int i = 0; i <= 10; i += 2) {
					System.out.println(i);
					
				}
		// print numbers between 0 and 100 where these numbers can be divided on 5 OR 3 without remains
				System.out.println("=============================");
				
				for (int i = 0; i <= 100; i++) {
					if(i % 3 == 0 || i % 5 == 0) {
						System.out.println(i);
					}
				}
				
				System.out.println("=============================");
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.println(i + " " + j);
					}
					
				}
				
				System.out.println("=============================");
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 10; j++) {
						System.out.print("*");
					}
					System.out.println();
				}
		
	}
}
