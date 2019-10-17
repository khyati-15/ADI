import java.util.*;

class LCP{
	
	public static String findcommon(String a,String b){
		String result="";
		int x=0;
		while(x<a.length() && x<b.length()){
			if(a.charAt(x)!=b.charAt(x))
				break;
			result+=a.charAt(x);
			x++;
		}
		return result;
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String input=sc.nextLine();
		String tokens[]=input.split(" ");
		String result=tokens[0];
		for(int i=0;i<tokens.length;i++){
			result=findcommon(tokens[i],result);
			if(result.length()==0)
				break;
		}
		if(result.length()>0){
			System.out.println(result);
		}
	}
}