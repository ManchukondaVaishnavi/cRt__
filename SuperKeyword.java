import java.util.*;
class Parent{
int a=100,b=200;
}
class Child extends Parent{

int a=10,b=20;
void show(){
System.out.println("this keyword:"+(this.a+this.b));
System.out.println("super keyword:"+(super.a+super.b));
}
}
public class SuperKeyword{
public static void main(String[] args){
Child d=new Child();
d.show();
}
}