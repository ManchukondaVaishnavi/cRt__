import java.util.*;
interface  Vechile{
 void noOfWheels();
}
class Car implements Vechile{
public void noOfWheels()
{
System.out.println("4 Wheels");
}
}
class Bus implements Vechile{
public void noOfWheels(){
System.out.println("6 Wheels");
}
}
class Auto implements Vechile{
public void noOfWheels(){
System.out.println("3 Wheels");
}
}
class Interface {
public static void main(String[] args){
Car c1=new Car();
c1.noOfWheels();
Bus b1=new Bus();
b1.noOfWheels();
Auto a=new  Auto();
a.noOfWheels();
}
}
