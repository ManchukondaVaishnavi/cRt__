import java.util.*;
public class StringtoCharArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.next();
char s1[]=str.toCharArray();
System.out.println(Arrays.toString(s1));
for(int i=0;i<s1.length;i++){
System.out.println(s1[i]);
}
}
}
