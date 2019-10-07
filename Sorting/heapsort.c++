/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include<iostream>

using namespace std;

void heapify(int A[],int i,int size){
    int max=i;
    int l=(2*i)+1,r=(2*i)+2;
    if(l<size && A[l]>A[max])
    max=l;
    
    if(r<size && A[r]>A[max])
    max=r;
    
    if(max!=i){
        swap(A[max],A[i]);
        heapify(A,max,size);
    }
}

void backheapify(int A[],int i,int size){
    int max=-1;
    int p=i/2;
    if(p>0 && A[i]>A[p])
    max=i;
    else
    max=p;
    if(max!=p){
        int temp=A[max];
        A[max]=A[i];
        A[i]=temp;
        backheapify(A,max,size);
    }
}

void heapsort(int arr[], int n) 
{ 
  
    // One by one extract an element from heap 
    for (int i=n-1; i>=0; i--) 
    { 
	
        swap(arr[0], arr[i]); 
  
        // call max heapify on the reduced heap 
        heapify(arr, 0, i); 
    } 
} 
void buildheap(int A[],int n){
   
    for(int i=(n/2)-1;i>=0;i--){
        heapify(A,i,n);
    }
	heapsort(A,n);
    for(int i=0;i<n;i++)
     cout<<A[i]<<' ';
}


int main(){
	 int n;
     cin>>n;
    int A[n]/*={20,7,5,40,2,1,0}*/;
    for(int i=0;i<n;i++)
    cin>>A[i];
    buildheap(A,n);
}