import java.util.*;
public class StringPalindrome{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.next();
String rev="";
for(int i=str.length()-1;i>=0;i--){
rev+=str.charAt(i);
}
if(str.equals(rev)){

System.out.print("Palindrome");
}
else{
System.out.print("Not palindrome");
}
}
}