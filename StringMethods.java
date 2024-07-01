import java.util.*;
public class StringMethods{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.next();
String str2=s.next();
String str3=s.next();
System.out.println(str);
str=str.replace("v","V");
System.out.println("Afer replace:"+str);
System.out.println("first index of a:"+str.indexOf("a"));
System.out.println("last index of a:"+str.lastIndexOf("a"));
System.out.println("Equals:"+str.equals(str2));
System.out.println("Equals insensitive:"+str2.equalsIgnoreCase(str3));
System.out.print("compareTo method:"+str2.compareTo(str3));
System.out.print("compareTo method:"+str2.compareToIgnoreCase(str3));

}
}
