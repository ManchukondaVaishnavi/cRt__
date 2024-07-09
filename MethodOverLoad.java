import java.util.*;
public class MethodOverLoad{
void show(){
System.out.println("Zero arguments");
}
void show(int a,int b){
System.out.println("Two arguments of int");
}
void show(float a){
System.out.println("One argument of float");
}
void show(double a){
System.out.println("one argument of double");
}
public static void main(String[] args){
MethodOverLoad m=new MethodOverLoad();
m.show();
m.show(10,20);
m.show(10.1f);
m.show(10.1);
}
}