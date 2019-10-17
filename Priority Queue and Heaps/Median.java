import java.util.*;

class Median{
	
	public static void printMedians(double arr[],int n){
		PriorityQueue<Double> maxheap=new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Double> minheap=new PriorityQueue<>();
		double med=arr[0];
		maxheap.add(med);
		System.out.println(med);
		for(int i=1;i<n;i++){
			double x=arr[i];
			if(maxheap.size()>minheap.size()){
				if(x<med){
					minheap.add(maxheap.peek());
					maxheap.poll();
					maxheap.add(x);
				}
				else
					minheap.add(x);
				med=(maxheap.peek()+minheap.peek())/2.0;
			}
			else if(maxheap.size()==minheap.size()){
				if(x<med){
					maxheap.add(x);
					med=Double.valueOf(maxheap.peek());
				}
				else{
					minheap.add(x);
					med=Double.valueOf(minheap.peek());
				}
			}
			else{
				if(x>med){
					maxheap.add(minheap.peek());
					minheap.poll();
					minheap.add(x);
				}
				else
					maxheap.add(x);
				med=(maxheap.peek()+minheap.peek())/2.0;
			}
			System.out.println(med);
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double arr[]=new double[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		printMedians(arr,n);
	}
}