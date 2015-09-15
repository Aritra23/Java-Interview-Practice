


public class StringUnique {

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringUnique ob = new StringUnique();
		String s = "abcdaa";
		ob.uniqueString(s);
		ob.isUniqueChar(s);
		

	}*/
     public void  uniqueString(String str)
     {
    	int counter =0;
        int len =str.length();
    	for(int i = 0; i <len; i++)
    	{
    		for(int j=i+1; j < len; j++)
    		{
    			if(str.charAt(i) == str.charAt(j))
    			{
    				counter ++;
    			
    			}
    	
    		}
    	}
    	if(counter == 0)
    	{
    		System.out.println("Unique");
    	}
    	else
    	{
    		System.out.println("Duplicate");
    	}
     }
     public boolean isUniqueChar(String str)
     {
    	 int checker = 0;
    	 for(int i=0; i<str.length(); i++)
    	 {
    		 int val =str.charAt(i) - 'a';
    		 if((checker &(1 << val)) > 0)
    		 {
    			 return false;
    		 }
    		 checker |= (1 << val);
    		 
    	 }
    	 return true;
     }
    	 
     
}
