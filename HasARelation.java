import java.util.*;

class Student{
int admo=542;
String name="vaishu";
public void display(){
System.out.print(admo+" "+name);
}
}
class Mark{
int mat=89,phy=90,che=100;

public void show(){
Student s=new Student();

s.display();
System.out.print(mat+" "+phy+" "+che);
}
}
public class HasARelation{
public static void main(String[] args){
Mark m=new Mark();
m.show();
}
}
