// input grade number
// grade must be in range [0 - 100] else pring error 
// [90 - 100] excellent
// [80 - 90[ very good
// [70 - 80[ good
// [60 - 70[ middle
// [50 - 60[ weak
// less than 50 fail

public class nestedIf{
	public static void main (String[] args) {
		double grade = 49;
		// System.out.print(grade);
		if (grade > 100 || grade < 0) {
			System.out.println("Grade out of range 0 - 100");
		} else {
			if (grade >= 90) {
				System.out.println("excellent");
			} else {
				if (grade >= 80) {
					System.out.println("very good");
				} else {
					if (grade >= 70) {
						System.out.println("good");
					} else {
						if (grade >= 60) {
							System.out.println("middle");
						} else {
							if (grade >= 50) {
								System.out.println("weak");
							} else {
								System.out.println("Fail");
							}
						}
					}
				}
			}
		}
		
	}
}