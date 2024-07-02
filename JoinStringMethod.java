import java.util.*;
public class JoinStringMethod{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str[]={"platform","dependent","lang"};
String str1=String.join(" ",str);
System.out.println(str1);
String str2=String.join(" is ",str);
System.out.println(str2);
String str3=String.join("",str);
System.out.println(str3);
}
}

