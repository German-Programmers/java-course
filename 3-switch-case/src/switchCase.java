
public class switchCase {
	public static void main(String[] args) {
		int grade = Integer.parseInt(args[0]);
		switch (grade) {
		case 1:
			System.out.println("A");
			break;
		case 2:
			System.out.println("B");
			break;
		case 3:
			System.out.println("c");
			break;
		case 4:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		case 6:
			System.out.println("F");
			break;
		default: 
			System.out.println("Error");
		}
	}
}
