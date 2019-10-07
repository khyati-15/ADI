import java.util.*;
class Ratinmaze{
	
	public static boolean ratinmaze(int maze[][],int size,int i,int j){
		if(maze[i][j]!=0){
			if((i==size-1) && (j==size-1))
			{
				System.out.println(i+" "+j);
				return true;
			}
				if(((i)!=(size-1)) && ratinmaze(maze,size,i+1,j) ){
					System.out.println(i+" "+j);
					return true;
				}
				else {
					if(((j)!=(size-1)) && ratinmaze(maze,size,i,j+1)){
					System.out.println(i+" "+j);
					return true;
				}
					else
						return false;
				}
		}
		else
			return false;
	}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int maze[][]=new int[size][size];
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++)
				maze[i][j]=sc.nextInt();
		}
		
		if(!ratinmaze(maze,size,0,0)){
			System.out.println("No path exist");
		}
	}
	
}