import java.util.Scanner;
class Node
{
	int data;
	Node next;
	 Node()
	{
	}
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
class LinkList
{
	Node head;
	LinkList()
	{
		head=null;
	}
	public void addNode(int x)
	{
		Node newNode=new Node(x);
		if(newNode==null)
		return;
		if(head==null)
		{
			head=newNode;
			//System.out.print(head.data);
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
				//System.out.print(temp.data+" ");
			}
			temp.next=newNode;
		}
		
	}
	public void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

}
	
public class CHECKLINKLIST
{
	public static void main(String[] args)
	{
		LinkList test1=new LinkList();
		test1.addNode(10);
		test1.addNode(20);
		test1.addNode(30);
		test1.addNode(40);
		test1.addNode(50);
		test1.display();
	}
}
