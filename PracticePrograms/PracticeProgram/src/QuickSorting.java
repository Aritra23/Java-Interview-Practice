
public class QuickSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {5,1,6,7,10,2,8};
		int n = input.length;
		//int[] output = new int[input.length];
		quicksort(input,0,n-1);
		for(int i = 0; i < n; i++)
		{
			
			System.out.println(input[i] + ",");
		}
		System.out.println("\n");

	}
    public static void swap(int[] input, int first, int last)
    {
    	int temp = input[first];
    	input[first] = input[last];
    	input[last] = temp;
    }
    public static int partition(int[] input, int first, int last)
    {
    	int pivot = input[(first+last)/2];
    	while(first <= last)
    	{
    	
    	
    	while(input[first] < pivot)
    		first++;
    	while(input[last] > pivot)
    		last--;
    	if(first <= last)
    	{
    	swap(input,first,last);
    	first++;
    	last--;
    	}
    	}
    	return first;
    	
    }
    public static void quicksort(int[] input, int first, int last)
    {
    	//if(first >= last)
    	//	return;
    	int index = partition(input, first, last);
    	if(first<index-1)
    	{
    	quicksort(input,first,index-1);
    	}
    	if(index < last){
    	quicksort(input,index,last);
    	}
    }
}
