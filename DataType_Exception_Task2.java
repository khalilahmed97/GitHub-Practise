package task1;
import java.util.InputMismatchException;
import java.util.Scanner;
public class DataType_Exception_Task2 {
	public static void main(String[] args) throws InputMismatchException, ArithmeticException{
		System.out.println("CALCULATOR FOR PERFORMING DIVIDE OPERATION");
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("ENTER FIRST NUMBER: ");
			int num1 = scan.nextInt();
			
			System.out.print("ENTER SECOND NUMBER: ");
			int num2 = scan.nextInt();
			float answer = num1/num2;
			System.out.print("ANSWER: "+answer);
		}
		catch(InputMismatchException e) {
			System.out.println("INVALID INPUT! PLEASE GIVE INTEGER INPUT");
		
		}
		catch(ArithmeticException e) {
			System.out.println("NUMBER CAN NOT BE DIVIED BY ZERO");
		
		}

	}
}
