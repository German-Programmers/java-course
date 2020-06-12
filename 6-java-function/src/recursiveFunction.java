
public class recursiveFunction {
public static void main (String[] args) {
	counter(10);
	System.out.println("//////////");
	System.out.println(factor(5));
}


public static void counter (int n) {
	System.out.println(n);
	if (n - 1 >= 0) {
		counter(n - 1);
	}
	
}
public static int factor(int n) {
	if (n == 1) {
		return 1;
	} else {
		return n * factor(n-1);
	}
}
// write a recursive function which return the sum numbers between 1 and n

}
