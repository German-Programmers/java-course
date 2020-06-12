
public class JavaFunctions {
	
	 
	public static void main (String[] args) {
	sayHello("Ahmad");
	sayHello("Husam");
	sayHello("Kaniwar");
	counter(-20);
	String fullName = joinNames("Ahmad", "Osman");
	System.out.println(fullName);
	}
	
	public static void sayHello (String name) {
		System.out.println("Hello " + name);
	}
	// write a function which takes int n as a parameter
	// and print the number from 0 to n
	public static void counter (int n) {
		System.out.println(joinNames("I am", "Counter"));
		if (n >= 0) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
			
			}
		} else {
			for (int i = 0; i >= n; i--) {
				System.out.println(i);
				
				}
		}
	}
	
	public static String joinNames(String firstName, String lastName) {
		String result = firstName + " " + lastName;
		return result;
		
	}
}
