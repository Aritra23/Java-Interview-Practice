
public class GetPrimeNumber {

	/**
	 * @param args
	 */
	public int getPrimeNumber(int n)
	{
		int i, j,count=0,flag;
		for(i = 2; i <=n; i++)
		{
			flag = 0;
			for(j = 2; j<=i/2; j++)
			{
				if((i%j) == 0)
				{
					flag = 1;
				    break;
				}
			}
			if(flag == 0)
			{
				count++;
			}
		}
		return count;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            GetPrimeNumber ob = new GetPrimeNumber();
            System.out.println(ob.getPrimeNumber(20));
            

	}

}
