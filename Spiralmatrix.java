public class Spiralmatrix {

    // Java program to form a Spiral Matrix
// from the given Array

	static final int R = 3 ;
	static final int C = 6;

	// Function to form the spiral matrix
	static void formSpiralMatrix(int arr[], int mat[][])
	{
		int top = 0,
			bottom = R - 1,
			left = 0,
			right = C - 1;
	
		int index = 0;
	
		while (true)
		{
			if (left > right)
				break;
	
			// print top row
			for (int i = left; i <= right; i++)
				mat[top][i] = arr[index++];
			top++;
	
			if (top > bottom)
				break;
	
			// print right column
			for (int i = top; i <= bottom; i++)
				mat[i][right] = arr[index++];
			right--;
	
			if (left > right)
				break;
	
			// print bottom row
			for (int i = right; i >= left; i--)
				mat[bottom][i] = arr[index++];
			bottom--;
	
			if (top > bottom)
				break;
	
			// print left column
			for (int i = bottom; i >= top; i--)
				mat[i][left] = arr[index++];
			left++;
		}
	}
	
	// Function to print the spiral matrix
	static void printSpiralMatrix(int mat[][])
	{
		for (int i = 0; i < R; i++)
		{
			for (int j = 0; j < C; j++)
				System.out.print(mat[i][j] + " ");
			System.out.println();
		}
	}
	
	// Driver code
	public static void main (String[] args)
	{
		int arr[] = { 1, 2, 3, 4, 5, 6,
					7, 8, 9, 10, 11, 12,
					13, 14, 15, 16, 17, 18 };
				
		int mat[][] = new int[R][C];
	
		formSpiralMatrix(arr, mat);
		printSpiralMatrix(mat);
	}
}

// This code is contributed by kanugargng

    
}
