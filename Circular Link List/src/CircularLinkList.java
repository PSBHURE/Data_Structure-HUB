
public class CircularLinkList {
private Node head;
private Node tail;
public CircularLinkList()
{
	head=null;
	tail=null;
}
public Node getHead() {
	return head;
}
public void setHead(Node head) {
	this.head = head;
}
public Node getTail() {
	return tail;
}
public void setTail(Node tail) {
	this.tail = tail;
}
public boolean insert(int data)
{
//	Node newNode=new Node(data);
//	if(newNode==null)
//		return false;
//	if(head==null)
//	{
//		head=newNode;
//		tail=newNode;
//		newNode.setNext(head);
//		return true;
//	}
//	else
//	{
//		Node temp=head;
//		while(temp.getNext()!=null){
//			temp=temp.getNext();
//		}
//		tail=temp;
//		tail.setNext(newNode);
//		tail=newNode;
//		newNode.setNext(head);
//		return true;
//	}
	Node newNode=new Node(data);
	if(newNode==null)
		return false;
	if(head==null)
	{
		head=newNode;
		newNode.setNext(head);
		return true;
	}
	
	
		Node temp=head;	
		while(temp.getNext()!=head)
		{
			temp=temp.getNext();
		}
		temp.setNext(newNode);
		tail=newNode;
		newNode.setNext(head);
		return true;
		
	}

public void display()
{
	Node temp=head;
	if(head==null)
		return;
	do {
		System.out.print(temp.getData()+" ");
		temp=temp.getNext();
	}while(temp!=head);
}

}
