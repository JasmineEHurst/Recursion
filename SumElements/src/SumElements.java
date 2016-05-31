/* *
 * 
 * Sums N elements in an array
 * 
 * */
public class SumElements {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8};
		System.out.println(sumElements(array, 4));
	}
	public static int sumElements(int array[], int n){
		if(n == 0){
			return 0;
		}else{
			int smallSum = sumElements(array, n - 1);
			return smallSum + array[n - 1];
		}
	}
}
