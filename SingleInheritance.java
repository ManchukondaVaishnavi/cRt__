import java.util.*;
class Father{
String fname;
int p1;
void getFather(String fname,int p){
this.fname=fname;
this.p1=p1;
}
void showFather(){
System.out.println("Father:"+fname);
System.out.println("p1:"+p1);
}
}
class Daughter extends Father{
String dname;
int p2;
void getDaughter(String dname,int p2){
this.dname=dname;
this.p2=p2;
}
void showDaughter(){
System.out.println("Daughter:"+dname);
System.out.println("p2:"+p2);
}
}
public class SingleInheritance{
public static void main(String[] args){
Daughter d=new Daughter();
d.getFather("xxx",100000);
d.getDaughter("yyy",1000);
d.showFather();
d.showDaughter();
}
}
