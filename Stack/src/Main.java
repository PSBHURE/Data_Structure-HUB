
public class Main {

	public static void main(String[] args) {
		Stack S=new Stack(5);
		S.push(10);
		S.display();
		S.push(20);
		S.push(30);
		S.push(40);
		S.push(50);
		S.display();
		S.pop();
		S.display();
		System.out.println(S.peek());
	}

}
