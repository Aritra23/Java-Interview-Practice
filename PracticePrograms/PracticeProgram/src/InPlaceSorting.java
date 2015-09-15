
public class InPlaceSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {4,2,9,6,23,12,34,0,1};
		insertionSort(input);
           
	}
	public static void insertionSort(int arr[])
	{
		int n = arr.length;
		for(int j=1; j < n; j++)
		{
			int key = arr[j];
			int i = j-1;
			while(( i > -1) && (arr[i] > key))
			{
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
			display(arr);
		}
	}
	public static void display(int[] input)
	{
		for(int i = 0; i < input.length; i++)
		{
			System.out.println(input[i] + ",");
		}
		System.out.println("\n");
	}

}
