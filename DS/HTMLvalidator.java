import java.util.*;
import java.io.*;
import khyati.ds.*;
class HTMLTags{
	
	public static boolean validate(String str){
		ArrayStack<String> s=new ArrayStack<>();
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='<' && str.charAt(i+1)!='/'){
				String tag=new String();
				while(str.charAt(i)!='>' && str.charAt(i)!=' ' && i<str.length()){
					tag+=str.charAt(i);
					i++;
				}
				tag+=">";
				s.push(tag);
			}
			else if(str.charAt(i)=='<' && str.charAt(i)!=' '  && str.charAt(i+1)=='/'){
				String tag=new String();
				while(str.charAt(i)!='>' && i<str.length()){
					if(str.charAt(i)!='/')
					tag+=str.charAt(i);
					i++;
				}
				tag+=">";
				if(tag.compareTo(s.top())==0){
					s.pop();
				}
				else
					return false;
			}
		}
		if(s.isEmpty())
			return true;
		else
			return false;
	}
	
	
	public static void main(String args[]){
		try{
			FileInputStream obj=new FileInputStream("html.txt");
			BufferedInputStream b=new BufferedInputStream(obj);
        	String data=new String();
			 while(b.available()>0)
          		data=data+(char)b.read();
        	System.out.println(validate(data));
		}
		catch(Exception e){
			
		}
	}
}