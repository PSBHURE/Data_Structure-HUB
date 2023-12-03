
public class DoubluLinkList {
private Node head;
private Node tail;
public DoubluLinkList()
{
	this.head=null;
	this.tail=null;
}
public boolean insert(int data)
{
	Node newNode=new Node(data);
	if(newNode==null)
		return false;
	if(head==null)
	{
		head=newNode;
		tail=head;
		return true;
	}
	else
	{
		tail.setNext(newNode);
		newNode.setPrev(tail);
		tail=newNode;
//		Node temp=head;
//		while(temp.getNext()!=null)
//		{
//			temp=temp.getNext();
//		}
//		temp.setNext(newNode);
//		newNode.setPrev(temp);
		return true;
	}
}
public void display()
{
	Node temp=head;
	while(temp!=null)
	{
		System.out.print(temp.getData()+" ");
		temp=temp.getNext();
	}
}
}
