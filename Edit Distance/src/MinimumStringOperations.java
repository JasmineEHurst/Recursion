
public class MinimumStringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "st";
		String str2 = "sun";
		System.out.println("The minimum number of operations (insert, remove, replace) to make str1 turn to str2 is " 
		+ minOperations(str1, str2, str1.length(), str2.length()));
	}
	
	public static int minOperations(String str1, String str2, int m, int n){
		//Base cases, if strings are empty
		if(m == 0)	
			return n;
		else if(n == 0)
			return m;
		//If characters are matching, recurse from next pair of characters, do not add 1 result
		else if(str1.charAt(m - 1) == str2.charAt(n - 1))
			return minOperations(str1, str2, m - 1, n - 1);
		/* Characters are not the same, 3 branches are created 
		 * based on the 3 operations, 
		 * the branch with minimum operations is chosen */
		else{ //Add 1 to the result
			return 1 + min(
					//Insert - need to transition in destination string but not source
					minOperations(str1, str2, m, n - 1),
					//Remove - need to transition in source string, but not destination string
					minOperations(str1, str2, m - 1, n), 
					//Replace - need to transition in both strings
					minOperations(str1, str2, m - 1, n -1));
		}
	}
	
	public static int min(int x, int y, int j){
		if(x < y && x < j)
			return x;
		else if(y < x && y < j)
			return y;
		else
			return j;
	}

}
