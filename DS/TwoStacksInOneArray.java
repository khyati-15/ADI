import java.util.*;

class TwoStack{
	public static int arr[]=new int[5];
	public static int top1=-1;
	public static int top2=5;
	public static int size=5;
	public static void push1(int data){
		if(top1<top2-1){
			top1++;
			arr[top1]=data;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	
	public static void push2(int data){
		if(top1<top2-1){
			top2--;
			arr[top2]=data;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	
	public static int pop1(){
		if(top1>=0){
			int x=arr[top1];
			top1--;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
			return -1;
		}
	}
	
	public static int pop2(){
		if(top2<size){
			int x=arr[top2];
			top2++;
			return x;
		}
		else{
			System.out.println("Stack Underflow");
			return -1;
		}
		
	}
	
	public static void main(String args[]){
		push1(5);
		push2(4);
		push1(3);
		push2(2);
		push1(1);
		push2(0);
		System.out.println("Element popped from stack 1 is "+pop1());
		push1(3);
		System.out.println("Element popped from stack 1 is "+pop1());
		System.out.println("Element popped from stack 2 is "+pop2());
		
	}
}