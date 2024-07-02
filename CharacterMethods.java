import java.util.*;
public class CharacterMethods{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
char c=s.next().charAt(0);
if(Character.isLetterOrDigit(c)){
System.out.println("Alpha-Numeric ");
if(Character.isLetter(c)){
System.out.println("Alphabet");
if(Character.isUpperCase(c)){
System.out.println("Upper case");
}
else{
System.out.println("Lower case");
}
}
}
else{
System.out.println("Symbol");
}
}
}