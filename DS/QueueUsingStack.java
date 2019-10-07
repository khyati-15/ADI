import java.util.Stack;
class Queue{
	Stack<Integer> s1=new Stack<Integer>();
	Stack<Integer> s2=new Stack<Integer>();
	int size=0;
	public void enqueue(int x){
		s1.push(x);
	}
	
	public void dequeue(){
		if(!s2.isEmpty())
			System.out.println("Element removed "+s2.pop());
		else{
			 while(!s1.isEmpty()){
        	s2.push(s1.pop());
			}
		System.out.println("Element removed "+s2.pop());
		}
	}
		
	public static void main(String args[]){
		Queue m=new Queue();
		m.enqueue(3);
		m.enqueue(2);
		m.enqueue(1);
		m.dequeue();
		m.dequeue();
	}
}