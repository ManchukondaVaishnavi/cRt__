import java.util.*;
public class SubStringMethods{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String str2=s.nextLine();
if(str.contains(str2)){
System.out.println("Found");
}
else{
System.out.println("Not Found");
}
System.out.println(str.substring(2));
System.out.println(str.substring(3,9));
String str1[]=str.split(" ");
System.out.println(Arrays.toString(str1));

}
}