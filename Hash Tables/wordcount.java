import java.util.*;
import java.lang.*;

class WordCount
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
String str=sc.nextLine();
str=str.trim().replaceAll("\\s{1,}"," ");
String ch[]=str.split(" ");
HashMap<String,Integer> count=new HashMap<String,Integer>();
for(int i=0;i<ch.length;i++)
{
if(count.containsKey(ch[i]))
{
count.put(ch[i],count.get(ch[i])+1);
}
else
count.put(ch[i],1);
}
count.forEach((key,value)->System.out.println(key+" : "+value));
}
}