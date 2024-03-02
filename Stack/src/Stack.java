
public class Stack {
private int[] arr;
private int size;
private int top;
public Stack(int size) {
	super();
	this.size = size;
	this.arr=new int[size];
	top=-1;
}
public int[] getArr() {
	return arr;
}
public void setArr(int[] arr) {
	this.arr = arr;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public int getTop() {
	return top;
}
public void setTop(int top) {
	this.top = top;
}
public boolean isFull() {
	if(top==size-1)
		return true;
	return false;
}
public boolean isEmpty()
{
	if(top==-1)
		return true;
	return false;
}
public boolean push(int data)
{
	if(isFull())
		return false;
	arr[++top]=data;
	return true;
}
public boolean pop()
{
	if(isEmpty())
		return false;
	--top;
	return true;
}
public int peek()
{
	if(isEmpty())
		return -1;
	return arr[top];
}
public void display()
{
	for(int i=0;i<=top;i++)
	{
		System.out.print(arr[i]+" ");
	}
	System.out.println();
}


















}
