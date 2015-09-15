package linkedlist;

public class ReverseLinkedList {

	/**
	 * @param args
	 */
	public void iterativeReverse(Node head){
		if(head == null || head.next == null){
			return; //empty or just one node
		}
		Node Second = head.next;
		Node Third = Second.next; //store third node before we change
		
		Second.next = head; //second now points to head
		head.next = null;  //change head pointer to null
		
		
		if(Third == null){
			return;
		}
		
		Node CurrentNode = Third;
		Node PreviousNode = Second;
		while(CurrentNode!= null){
			Node NextNode = CurrentNode.next;
			CurrentNode.next = PreviousNode;
			
			/* repeat the process , but have to reset the Previous Node and the Current Node */
			
			PreviousNode = CurrentNode;
			CurrentNode = NextNode;
		}
		head = PreviousNode; //reset head node
		
	
		
		
	}
	public void recursiveReverse(Node currentNode){
		
		if(currentNode == null){
			return;
		}
		/*if we are at the tail node recursive base case*/
		if(currentNode.next == null){
			//set head to current Tail since we are reversing the list
			//head = currentNode;
			return;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
