
public class LCS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String firstString = "AGGTAB";
		String secondString = "GXTXAYB";
		int firstLength = firstString.length();
		int secondLength= secondString.length();
		char[] m = firstString.toCharArray();
		char[] n = secondString.toCharArray();
		System.out.println("The longest common subsequence for this string is: " + 
				longestCommonSubsequence( m , n , firstLength , secondLength ));
	}
	public static int longestCommonSubsequence(char[] firstString, char[] secondString, int m, int n){
	
		//Base case
		if(m == 0 || n == 0)
			return 0;
		else if(firstString[m - 1] == secondString[n - 1])
			return 1 + longestCommonSubsequence(firstString, secondString, m - 1, n - 1);
		else{
			return max(longestCommonSubsequence(firstString, secondString, m - 1, n), 
						longestCommonSubsequence(firstString, secondString, m, n- 1));
		}
			
	}
	
	public static int max(int a, int b){
		return (a > b)? a : b;
	}
}
