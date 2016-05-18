import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int n = scan.nextInt();
		/*Consider is n was 0, need to obtain enough space*/
		int cache[] = new int[n + 1];
		System.out.println(Fibonacci(n, cache));

	}
	/*Function includes caching of results*/
	public static int Fibonacci(int n, int[] cache){
		if(n == 0){
			return 0;
		}else if(n == 1){
			return 1;
		}
		/*if there is a result stored for n*/
		else if(cache[n] > 0){
			return cache[n];
		}/*compute Fibonacci(n) and store it*/
		else{
			cache[n] = Fibonacci(n - 1, cache) + Fibonacci(n - 2, cache);
			return cache[n];
		}
	}
}
