class Sample{
int a,b;
void getData(int a,int b){
this.a=a;
this.b=b;
}
void show(){
System.out.println("a:"+a);
System.out.println("b:"+b);
}
}
class Add extends Sample{
void add(){
System.out.println("Addition:"+(a+b));
}
}
class Product extends Sample{
void product(){
System.out.println("Multiplication:"+(a*b));
}
}
class HierarchialInheritance{
public static void main(String[] args){
Add ad=new Add();
ad.getData(10,20);
ad.show();
ad.add();
Product p=new Product();
p.getData(10,20);
p.product();
}
}