
public class Matrixmanipulation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrixmanipulation ob = new Matrixmanipulation();
		int[][] data = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int x =3;
		for(int i=0; i < 3; i++)
		{
			for(int j =0; j <3; j++)
			{
				System.out.println("The input matrix:\n" + data[i][j]);
			}
		}
		ob.rotate(data, x);
		
		
		

	}
	public void rotate(int[][] matrix, int n)
	{
		for (int layer = 0; layer < n / 2; ++layer) {
			 int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; ++i) {
			int offset = i - first;
			// save top
			 int top = matrix[first][i];
		
			// left -> top
			 matrix[first][i] = matrix[last-offset][first];
			
			 // bottom -> left
			 matrix[last-offset][first] = matrix[last][last - offset];
			
			 // right -> bottom
			 matrix[last][last - offset] = matrix[i][last];
			
			 // top -> right
			 matrix[i][last] = top;
			 
			 }
			 }
		     for(int i = 0; i < 3; i++)
		     {
		    	 for(int j =0; j<3; j++)
		    	 {
		    		 System.out.println("The output matrix:"+matrix[i][j]);
		    	 }
		     }
	}

}
