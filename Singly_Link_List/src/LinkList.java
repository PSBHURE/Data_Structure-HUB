public class LinkList {
	Node head;
	public LinkList()
	{
		this.head=null;
	}
	public void setHead(Node next)
	{
		this.head=next;
	}
	public Node getHead()
	{
		return head;
	}
	public boolean insert(int data)
	{
		Node newNode=new Node(data);
		if(newNode==null)
		{
			return false;
		}
		if (head==null)
		{
			head=newNode;
			return true;
		}
		else
		{
			Node temp=head;
			while(temp.getNext()!=null)
			{
				temp=temp.getNext();
			}
			temp.setNext(newNode);
			
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
