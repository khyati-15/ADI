import java.util.*;
class BTree{

	private static class Node{
	private int data;
	private Node left;
	private Node right;
	public Node(){
			
	}
	public Node(int num){
		data=num;
		left=null;
		right=null;
	}
	public int getData(){
		return data;
	}
	public Node getleft(){
		return left;
	}
	public void setleft(Node l){
		left=l;
	}
	public Node getright(){
		return right;
	}
	public void setright(Node l){
		right=l;
	}
	
	}
	private static Node root=null;
	
	public static void printallpaths(Node node,int path[],int len){
		if(node==null){
			
		}
		else{
			path[len]=node.getData();
			len++;
			if(node.getleft()==null && node.getright()==null)
				printarray(path,len);
			else{
				printallpaths(node.getleft(),path,len);
				printallpaths(node.getright(),path,len);
			}
		}
	}
	
	public static void printarray(int path[],int len){
		for (int i = 0; i < len; i++)  
        { 
            System.out.print(path[i] + " "); 
        } 
        System.out.println(""); 
	}
	
	
	public static Node insert(Node r,int num){
		if(r==null){
			Node newnode=new Node(num);
			r=newnode;
			return newnode;
		}
		else{
			if(r.getData()>num){
				r.setleft(insert(r.getleft(),num));			
			}
			else{
				r.setright(insert(r.getright(),num));
			}
		}
		return r;
	}
	
	public static void main(String args[]){
		int path[]=new int[1000];
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		while(num!=-1){
			root=insert(root,num);
			num=sc.nextInt();
		}
		System.out.println("ALL PATHS :");
		printallpaths(root,path,0);
	}
}
