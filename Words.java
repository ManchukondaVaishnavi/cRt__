import java.util.*;
public class Words{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String [] str1=str.split(" ");
int max=str1[0].length();
String res=str1[0];
for(int i=0;i<str1.length;i++){
String temp=str1[i];
if(max<temp.length()){
max=temp.length();
res=temp;
}
}
System.out.println(res);
}
}
