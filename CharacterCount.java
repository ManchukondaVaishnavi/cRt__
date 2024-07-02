import java.util.*;
public class CharacterCount{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.next();
int a=0,u=0,l=0,d=0,sy=0;
for(int i=0;i<str.length();i++){
if(Character.isLetter(str.charAt(i))){
a++;
if(Character.isUpperCase(str.charAt(i))){
u++;
}
else{
l++;
}
}
else if(Character.isDigit(str.charAt(i))){
d++;
}
else{
sy++;
}
}
System.out.print(a+"\n"+u+"\n"+l+"\n"+d+"\n"+sy);
}
}
