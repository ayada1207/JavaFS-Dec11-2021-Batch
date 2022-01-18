package stackImplementation;

	class MyStack 
	{
		int Max = 20;
		int top =-1;
		int[] data = new int[Max];
		
		public void push(int d) 
		{
			data[top+1] =d;
			top += 1;
		}
		
		public void printData()
		{
			for(int i=0;i<=top;i++) 
			{
				System.out.println(data[i]+"+++");
			}
		}
		public boolean isEmpty() 
		{
			return (top ==-1);
		}
		public int pop()
		{
			int temp = data[top];
			top = top-1;
			return temp;
		}
		
		public int peek()
		{
			return data[top];
		}
	}
	
	public class MyClass
		{	

	public static void main(String[] args) 
	{
		
		MyStack ms = new MyStack();
		ms.push(20);
		ms.push(22);
		ms.push(24);
		ms.pop();

		if(ms.isEmpty()) System.out.println("List is Empty");
		else
		{
		System.out.println("List is Not empty and data is below");	
		ms.printData();
		System.out.println("TopMost element is: "+ms.peek());
		}
		
	}
		}

