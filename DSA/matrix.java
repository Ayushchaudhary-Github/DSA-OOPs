public class matrix {
 //static int a,b,Diff=a+b;

	// Function to print the Principal Diagonal
	static void print1stDiagonal(int mat[][], int n,int a)
	{
		System.out.print("1st Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if (i == j) {
                    System.out.print(mat[i][j] + ", ");
                    a = a + mat[i][j];
				}
			}   
		}
        System.out.print("Sum of 1st = ");
        System.out.print(a);
		System.out.println(""); 
	}

	static void print2ndDiagonal(int mat[][], int n,int b)
	{
		System.out.print("2nd Diagonal: ");

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				if ((i + j) == (n - 1)) {
					System.out.print(mat[i][j] + ", ");
                    b = b+mat [i][j];
				}
			}
		}
        System.out.print("Sum of 2nd = ");
        System.out.print(b);
		System.out.println("");
	}

    public static void main(String args[])
	{
		int num = 3;
        int st=0,nd=0;
        
		int a[][] = { { 1, 2, 3},
					  { 4, 5, 6},
					  { 9, 8, 9} };

		print1stDiagonal(a, num, st);
		print2ndDiagonal(a, num, nd);
	}
}
