class KMPAlgo{
	
	public static void KMPSearch(String pattern,String text){
		int len1=pattern.length();
		int len2=text.length();
		int i=0;
		int j=0;
		int arr[]=new int[len1];
		construct_array(pattern,len1,arr);
		while(i<len2){
			if(pattern.charAt(j)==text.charAt(i)){
				j++;
				i++;
			}
			if(j==len1){
				 System.out.println("Found pattern " + "at index " + (i - j)); 
                j = arr[j - 1]; 
			}
			else if (i < len2 && pattern.charAt(j) != text.charAt(i)) { 
                if (j != 0) 
                    j = arr[j - 1]; 
                else
                    i = i + 1; 
            } 
		}
	}
	
	public static void construct_array(String pattern, int length, int arr[]){
		int j=0;
		for(int i=1;i<length;i++)
    {
        if(pattern.charAt(i)==pattern.charAt(j))
        {
            arr[i] = arr[i-1]+1;
            j++;
        }
        else
        {
            j=0;
        }
    }
	}
	
	public static void main(String args[]) 
    { 
        String txt = "AABAACAADAABAABA"; 
        String pat = "AABA"; 
        KMPSearch(pat, txt); 
    } 
}