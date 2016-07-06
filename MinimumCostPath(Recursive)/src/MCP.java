
public class MCP {

	public static void main(String[] args) {
		int[][] array = {{0,1,2},
						{3,4,5},
						{6,7,8}};
		System.out.printf("The minimum cost path from origin to (2,2) in the array\n0,1,2\n3,4,5\n6,7,8 is %d"
				,minimumCostPath(array, 2, 2));

	}
	
	public static int minimumCostPath(int[][] array, int m, int n){
		/* 			Base Cases			*/
		//If path moves to an invalid space, it should never be chosen 
		if(m < 0 || n < 0)
			return Integer.MAX_VALUE;
		//If the path reaches the starting point (which is 0,0)
		//, just return starting point
		else if(m == 0 && n == 0)
			return array[m][n]; //Same as array[0][0]
		/* 	Recurse to next point in path, choosing the branch with less cost	*/
		else
			return min(minimumCostPath(array, m -1, n),
					minimumCostPath(array, m, n -1),
					minimumCostPath(array, m - 1, n - 1)) + array[m][n];
	}
	
	public static int min(int x, int y, int z){
		if(x < y)
			return (x < z)? x : z;
		else
			return (y < z)? y : z;
	}
}
