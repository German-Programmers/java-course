public class JavaVariables {
public static void main(String[] args) {

// int x = 5;
// int y = 2;
// String batata = "Hello World";
// System.out.println(batata + (y + x));

int firstNumber = Integer.parseInt(args[0]); 
int secondNumber = Integer.parseInt(args[1]);
int thirdNumber = Integer.parseInt(args[2]);
// + - / * 
// % dividing rest

// boolean check = false;

// if (check) {
// System.out.println(firstNumber + secondNumber);
//}

//if(firstNumber > secondNumber){
//System.out.println("the first is greater");
//} else {
//System.out.println("the second is greater");
//}

if (firstNumber > secondNumber && firstNumber > thirdNumber){
System.out.println("the first is the greatest");
} else {

if (secondNumber > firstNumber && secondNumber > thirdNumber){
System.out.println("the second is the greatest");
} else {
System.out.println("the third is the greatest");
}



}





}
}
