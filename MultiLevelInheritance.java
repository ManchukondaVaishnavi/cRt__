import java.util.*;
class GrandFather{
String gname="xxx";
int p1=100000;
void showGrandFather(){
System.out.println("GrandFather:"+gname);
System.out.println("p1:"+p1);
}
}
class Father extends GrandFather{
String fname="yyy";
int p2=1000;
void showFather(){
System.out.println("Father name:"+fname);
System.out.println("p2:"+p2);
System.out.println("Total property:"+(p1+p2));
}
}
class Daughter extends Father{
String dname="zzz";
int p3=100;
void showDaughter(){
System.out.println("Daughter:"+dname);
System.out.println("p3:"+p3);
System.out.println("total property:"+(p1+p2+p3));
}
}
public class MultiLevelInheritance{
public static void main(String[] args){
Daughter d=new Daughter();
d.showGrandFather();
d.showFather();
d.showDaughter();
}
}
