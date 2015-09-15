import java.util.StringTokenizer;


public class StringBlankSpacereplace {

	/**
	 * @param args
	 */
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	public static String replaceSpace(String str)
	{
		String s = "";
	   char cur = str.charAt(0);
	   int n = 0;
	   for(int i = 0; i <str.length(); i++)
	   {
		   if(cur == str.charAt(i))
		   {
			   n++;
		   }
		   else
		   {
			   s = s+cur+n;
			   
			   n=1;
			   cur = str.charAt(i);
		   }
		   
	   }
	   s = s+cur+n;
	   if(str.length() < s.length())
	   {
		   return str;
	   }
	   else
		   return s;
	}
		public static boolean validateUserName(String username)
		{
			//String s="HelloHello_job";
			Boolean flag=false;
			StringTokenizer st=new StringTokenizer(username,"_");
			while(st.hasMoreTokens())
			{
				if(st.nextToken().length() < 8)
				{
					 flag=false;
					 break;
					
				}
				else
					flag=true;
				break;
				
			
			}
			System.out.println(flag);
			return flag;
		}

	
	

		/**
		 * @param args
		 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//StringBlankSpacereplace ob=new StringBlankSpacereplace();
			//ob.validateUserName("HelloHello_job");
			System.out.println(StringBlankSpacereplace.replaceSpace("aaaabbccd"));
			

		}	
				
		
		
				
			}
	  
	
	
		
	


