package task1;
import java.util.Scanner;
public class ArrayExceptionTask {
	public static void main(String[] args) {
		int [] numbers = {1, 25, 14, 15, 90, 80, 79, 11, 70, 55};
		
		System.out.print("ENTER THE INDEX OF AN ARRAY: ");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		try {
			int value = numbers[input];
			System.out.println(value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("GIVEN ARRAY INDEX OUT OF BOUND");
		}
	}
}
