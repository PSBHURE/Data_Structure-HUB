public class Stack <T> {
    private T [] arr;
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        top = -1;
        arr = (T [] ) new Object[size];
    }
    public boolean isempty()
    {
    	return top==-1;
    }
    public boolean isfull()
    {
    	return top==size-1;
    }
    public boolean push(T data)
    {
    	if(isfull())
    	{
    		return false;
    	}
    	arr[++top]=data;
    	return true;
    }
    public T pop()
    {
    	if(isempty())
    		return null;
    	return arr[top--];
    }
    public T peek() {
        if(isempty()) {
            return null;
        }

        return arr[top];

        /*T data = pop();
        push(data);
        return data;*/
    }
}