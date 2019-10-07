import java.util.*;

class Permutations{
	
	public static void generateString(String str,String ans){
		if(str.length()==0)
			System.out.println(ans);
		else {
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				String res=str.substring(0,i)+str.substring(i+1);
				generateString(res,ans+ch);
			}
		}
	}
	
		public static void distinctString(String str,String ans){
		if(str.length()==0)
			System.out.println(ans);
		else {
			boolean arr[]=new boolean[26];
			for(int i=0;i<str.length();i++){
				char ch=str.charAt(i);
				String res=str.substring(0,i)+str.substring(i+1);
				if(arr[ch-'a']==false)
				distinctString(res,ans+ch);
				arr[ch-'a']=true;
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String a=str;
		generateString(str,"");
		System.out.println("DISTINCT");
		distinctString(a,"");
	}
}