
package linkedlist;


public class LinkedList{

	/**
	 * @param args
	 */
	
	public static Node head;
	/*private LinkedList<E> head = null;
	String data;
	private LinkedList<E> next;
	public LinkedList()
	{
		head = null;
	}
	
	public LinkedList(String item, Object object) {
		// TODO Auto-generated constructor stub
	}
    public void addFirst(String item)
    {
    	head = new LinkedList<E>(item,head);
    }
	public void addLast(String item)
	{
		if(head == null)
		{
			addFirst(item);
		}
		else
			addLast(head,item);
	}
	private void addLast(LinkedList<E> node, String item)
	{
		if(node.next!=null)
		{
			addLast(node.next,item);
			
		}
		else
			node.next = new LinkedList<E>(item,null);
		
	}
	public void delete(String x)
	{
		head = delete(head, x);
	}
	private LinkedList<E> delete(LinkedList<E> node, String x)
	{
		if(node== null)
			System.out.println("Cannot delete");
		else
			if(node.data == x)
				return node.next;
			else
				node.next = delete(node.next,x);
		return node;
			
	}*/
	
	private Node first;
	public LinkedList()
	{
		first = null;
	}
	public boolean isEmpty()
	{
		return (first == null);
	}
	public void insert(int val) {
		
		Node newnode = new Node(val);
		newnode.next = first;
		first = newnode;
		
	}
	public Node delete()
	{
		Node temp =first;
		first = first.next;
		return temp;
	}
	public void display()
	{
		System.out.println("List items from first to last:");
		Node current = first;
		while(current != null)
		{
			current.displayNode();
			current = current.next;
		}
		System.out.println("");
	}
	public Node search(int val)
	{
		Node current = first;
		while(current.item!=val)
		{
			if(current.next == null)
				return null;
			else 
				current=current.next;
		}
		return current;
	}
	public Node delete(int val)
	{
		Node current = first;
		Node previous = first;
		while(current.item != val)
		{
			if(current.next == null)
			{
				return null;
			}
			else
			{
				previous = current;
				current = current.next;
			}
		}
		if(current == first)
            first = first.next;
        else
            previous.next = current.next;
        return current;
    
	}
	public static void deletedup(Node head)
	{
		if(head == null)
			return;
		Node cur = head;
		Node runner = cur;
		while(runner.next != null)
		{
			if(runner.next.item == cur.item)
			{
				runner.next = runner.next.next;
			}
			else
			{
				runner=runner.next;
			}
		}
		cur =cur.next;
	}
	public static int nthToLast(Node head, int k)
	{
		if(head == null)
			return 0;
		int i = nthToLast(head.next, k) + 1;
		if (i == k) {
		System.out.println(head.item);
		}
		return i;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ob = new LinkedList();
		ob.insert(10);
		ob.insert(20);
		ob.insert(30);
		ob.insert(40);
		ob.insert(50);
	    ob.display();
		LinkedList.nthToLast(head,4);
		
		

	}

}
