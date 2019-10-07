import java.util.*;
class Stack{
	Queue<Integer> s1=new LinkedList<>();
	Queue<Integer> s2=new LinkedList<>();
	int size=0;
	public void push(int x){
		size++;
		s2.add(x);
		while(!s1.isEmpty()){
			s2.add(s1.peek());
			s1.remove();
		}
		Queue<Integer> q=s2;
		s2=s1;
		s1=q;
	}
	
	public void pop(){
		if(s1.isEmpty())
			return;
		System.out.println("Element popped is "+s1.remove());
		size--;
	}
	
	
	
	public static void main(String args[]){
		Stack m=new Stack();
		m.push(3);
		m.push(2);
		m.push(1);
		m.pop();
	}
}