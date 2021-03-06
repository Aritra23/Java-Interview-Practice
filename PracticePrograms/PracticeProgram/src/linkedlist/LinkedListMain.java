package linkedlist;

public class LinkedListMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList object = new LinkedList();
        object.insert(10);
        object.insert(20);
        object.insert(30);
        object.display();
     
        while( !object.isEmpty() )
        {
            Node member = object.delete();
            System.out.print("Deleted ");
            member.displayNode();
            System.out.println("");
        }
        object.display();
     
        object.insert(40);
        object.insert(50);
        object.insert(60);
        object.display();
 
        Node objecttosearch = object.search(40);
        
        if( objecttosearch != null)
            System.out.println("Found Node : " + objecttosearch.item);
        else
            System.out.println("Cannot locate the node");
 
        Node objecttodelete = object.delete(40);
 
        if( objecttodelete != null )
            System.out.println("Deleted node : " + objecttodelete.item);
        else
            System.out.println("Cannot delete the node");
 
 
        object.display();
         
    

	}

}
