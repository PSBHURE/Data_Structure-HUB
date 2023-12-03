public class Main {
	public static void main(String[] args) {
		CircularLinkList l1=new CircularLinkList();
		System.out.println("\nresult of insertion");
		l1.insert(10);
		l1.display();
		System.out.println();
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		l1.insert(400);
		l1.insert(500);
		l1.insert(600);
		l1.display();
		System.out.println("\ndelete first node result");
		l1.deleteFirstNode();
		l1.deleteFirstNode();
		l1.deleteFirstNode();
		l1.display();
		System.out.println("\ndelete last node result");
		l1.deleteLastNode();
		l1.display();
		System.out.println("\ndelete positioal node result");
		l1.delete(1);
		l1.display();
		System.out.println();
		l1.delete(3);
		l1.display();
		System.out.println();
		l1.delete(30);
		l1.display();
		System.out.println();
	}

}
