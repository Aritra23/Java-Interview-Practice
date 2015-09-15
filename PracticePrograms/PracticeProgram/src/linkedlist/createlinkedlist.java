package linkedlist;

public class createlinkedlist {

	/**
	 * @param args
	 
	 *
	 *
	*/
	createlinkedlist next = null;
	 static int data;
	public createlinkedlist(int d) {
		// TODO Auto-generated constructor stub
		data = d;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		createlinkedlist ob = new createlinkedlist(data);
		createlinkedlist ob1 = new createlinkedlist(data);
		System.out.println(ob.appendToTail(0));
		
		System.out.println(ob1.appendToTail(9));
		
		
		
		

	}
	  int appendToTail(int d)
	{
		createlinkedlist end = new createlinkedlist(d);
		createlinkedlist n=this;
		while(n.next != null)
		{
			n=n.next;
		}
		n.next = end;
		return d;
	}

}
