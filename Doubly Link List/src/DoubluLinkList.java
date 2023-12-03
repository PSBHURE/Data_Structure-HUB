
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
public boolean insert(int data,int p)
{
 if(p<=0)
	 return false;
 if(p==1)
 {
	 insert(data);
	 return true;
 }
 Node newNode=new Node(data);
 Node tempP=head;
 Node tempN=tempP.getNext();
 for(int i=1;i<p-1;i++)
 {
	 tempP=tempN;
	 tempN=tempP.getNext();
 }
 newNode.setPrev(tempP);
 newNode.setNext(tempN);
 tempP.setNext(newNode);
 tempN.setPrev(newNode);
 return true;
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
