import java.io.*;
import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = scan.nextInt();
		System.out.println(factorial(n));

	}

	public static int factorial(int n){
		if(n < 2){
			return 1;
		}else{
			return n * factorial(n-1);
		}
	}
}
