
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
	return true;
}
public void display()
{
	System.out.println(head.getData());
}
}
