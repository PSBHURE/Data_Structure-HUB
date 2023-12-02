public class Main {
	public static void main(String[] args) {
		CircularLinkList l1=new CircularLinkList();
		l1.insert(10);
		l1.display();
		System.out.println();
		l1.insert(20);
		l1.insert(30);
		l1.insert(40);
		l1.insert(50);
		l1.insert(60);
		l1.display();
		System.out.println();
		l1.deleteFirstNode();
		l1.deleteFirstNode();
		l1.deleteFirstNode();
		l1.display();
		System.out.println();
	}

}
