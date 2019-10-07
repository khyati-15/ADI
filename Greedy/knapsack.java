import java.util.Scanner;

class KnapSack{
	public  static void main(String args[]){
		float p[]={10,5,15,7,6,18,3};
		float w[]={2,3,5,7,1,4,1};
		float pw[]=new float[7];
		
		for(int i=0;i<7;i++)
			pw[i]=(float)p[i]/w[i];
		
		float c=15;
		
		for(int i=0;i<6;i++){
			for(int j=0;j<6-i;j++){
				if(pw[j]>pw[j+1]){
					float temp=pw[j];
					pw[j]=pw[j+1];
					pw[j+1]=temp;
					
					 temp=p[j];
					p[j]=p[j+1];
					p[j+1]=temp;
					
					temp=w[j];
					w[j]=w[j+1];
					w[j+1]=temp;
				}
			}
		}
		float currentcap=c;
		float currentprofit=0;
		for(int i=6;i>=0 && currentcap!=0;i--){
			if(w[i]<currentcap){
				currentcap-=w[i];
				System.out.println(pw[i]);
				currentprofit+=p[i];
			}
			else{
				System.out.println(pw[i]);
				currentprofit+=((currentcap/w[i])*p[i]);
				currentcap=0;
			}
		}
		System.out.println(currentprofit);
	}
}