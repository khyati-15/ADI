import java.util.*;
class MinInStack{
	Integer minElement;
	Stack<Integer> s=new Stack<>();
	public void push(int x){
		if(s.isEmpty()){
			minElement=x;
			s.push(x);
		}
		else if(x<minElement){
			s.push(2*x-minElement);
//			System.out.println(2*x-minElement);
			minElement=x;
		}
		else
			s.push(x);
	}
	
	public void pop(){
		if(s.isEmpty())
			return;
		System.out.print("Popped element is : ");
		Integer ans=s.pop();
		if(ans<minElement){
			System.out.println(minElement); 
            minElement=2*minElement-ans; 
		}
		else
			System.out.println(ans);
	}
	
	public void getMin(){
		if(s.isEmpty())
			System.out.println("Stack is empty");
		else{
			System.out.println("Min Element is "+minElement);
		}
	}
	
	public static void main(String args[]){
		MinInStack m=new MinInStack();
		m.push(3);
		m.push(2);
		m.push(1);
		m.pop();
		m.getMin();
	}
}