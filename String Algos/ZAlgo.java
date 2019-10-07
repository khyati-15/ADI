class ZAlgo{
	
	public static void search(String pattern,String text){
		String com=pattern+"$"+text;
		int l=com.length();
		int Z[]=new int[l];
		constructArray(com,Z);
		for(int i=0;i<l;i++)
			if(Z[i]==pattern.length())
				System.out.println("Pattern found at index "+ (i - pattern.length() - 1)); 
	}
	
	public static void constructArray(String str,int Z[]){
		int left=0,right=0;
		for(int i=1;i<str.length();i++){
			if(i>right){
				left=i;
				right=i;
				while(right<str.length() && str.charAt(right-left)==str.charAt(right))
					right++;
				Z[i]=right-left;
				right--;
			}
			else{
				int n=i-left;
				if(Z[n]<right-i+1)
					Z[i]=Z[n];
				else{
					left=i;
					while(right<str.length() && str.charAt(right-left)==str.charAt(right))
						right++;
					Z[i]=right-left;
					right--;
				}
			}
		}
	}
	
	public static void main(String args[]) 
    { 
        String txt = "AABAACAADAABAABA"; 
        String pat = "AABA"; 
        search(pat, txt); 
    } 
}