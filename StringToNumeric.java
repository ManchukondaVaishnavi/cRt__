import java.util.*;
public class StringToNumeric{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String str1=s.nextLine();
System.out.println(Integer.parseInt(str)+Integer.parseInt(str1));
System.out.println(Float.parseFloat(str)+Float.parseFloat(str1));
}
}