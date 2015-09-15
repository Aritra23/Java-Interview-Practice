
public class MissingtermAP {

	/**
	 * @param args
	 */
	public int getMissingTerm(int[] arr)
	{
		int diff[] = new int[arr.length - 1];
		int i, j;
		int n = 0;
		for(i = 1; i < arr.length; i++)
		{
			diff[i-1] = arr[i] - arr[i-1];
		}
		for(j=1; j < arr.length; j++)
		{
			if(diff[j] != diff[j+1])
			{
				n = arr[j] + diff[j+1];
				//System.out.println("The missing term:" +n);
				break;
			}
		}
		return n;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,6,1,-4,-14};
		MissingtermAP ob = new MissingtermAP();
		
		System.out.println(ob.getMissingTerm(arr));
		

	}

}
