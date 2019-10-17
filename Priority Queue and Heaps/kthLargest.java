import java.util.*;

class MinHeap{
	int harr[];
	int size;
	MinHeap(){
		
	}
	MinHeap(int arr[],int k){
		harr=new int[arr.length];
		harr=arr;
		size=k;
	}
	
	void buildheap(){
		for(int i=0;i<size;i++)
			System.out.println(harr[i]);
		int i=(size-1)/2;
		while(i>=0){
			heapify(i);
			i--;
		}
	}
	
	int extractmin(){
		if(size==0)
			return 0;
		int root=harr[0];
		if(size>1){
			harr[0]=harr[size-1];
			heapify(0);
		}
		size--;
		return root;
	}
	
	void heapify(int i){
		int l=2*i+1;
		int r=2*i+2;
		int small=i;
		if(l<size && harr[l]<harr[small])
			small=l;
		if(r<size && harr[r]<harr[small])
			small=r;
		if(small!=i){
			int temp=harr[i];
			harr[i]=harr[small];
			harr[small]=temp;
			heapify(small);
		}
	}
	
	int getmin(){
		return harr[0];
	}
	
	void replacemin(int x){
		harr[0]=x;
		heapify(0);
	}
	
}


class kthLargest{
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int arr[]=new int[k];
		MinHeap mh=new MinHeap(arr,k);
		int count=0;
		while(true){
			int num=sc.nextInt();
			if(num==-1)
				break;
			if(count<k-1){
				arr[count]=num;
				count++;
			}
			else{
				if(count==k-1){
					arr[count]=num;
					mh.buildheap();
				}
				else{
					if(num>mh.getmin())
						mh.replacemin(num);
				}
				System.out.println("kth largest is "+mh.getmin());
				count++;
			}
			
		}
		
	}
}