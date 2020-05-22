
public class ForLoop {
public static void main(String[] args) {
	// for(start ; condition; step)
//	for(int i = 1; i <= 10 ; i++ ) {
//		System.out.println(i);
//	}
	// i++ =>  i = i + 1 => i += 1
	
	int storage = 0;
	for (int i = 1 ; i <=100 ; i++) {
		storage = storage + i;
	}
	
	System.out.println(storage);
	
	// 1 +2 +3 +4 +5
	// 5! = 1 * 2 * 3 * 4 * 5 = 120
	
	long factor = 1;
	for (long x = 2 ; x <= 5 ; x++) {
		factor = factor * x;
	}
	System.out.println(factor);
}
}
