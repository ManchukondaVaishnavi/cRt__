import java.util.*;
public class Lexicography{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
String str[]=new String[n];
for(int i=0;i<n;i++){
str[i]=s.next();
}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
if((str[i].compareTo(str[j]))>0){
String temp=str[i];
str[i]=str[j];
str[j]=temp;
}
}
}for(int i=0;i<n;i++){
System.out.println(str[i]);
}
}
}