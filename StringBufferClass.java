import java.util.*;
public class StringBufferClass{
public static void main(String[] args){
StringBuffer str=new StringBuffer("Java");
StringBuffer str1=new StringBuffer("Language");
System.out.println(str);
System.out.println(str1);
str.append(str1);
System.out.println(str);
}
}
