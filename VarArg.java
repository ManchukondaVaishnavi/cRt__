import java.util.*;
class VarArg{
void show(int ...a){
int sum=0;
for(int x:a){
sum+=x;
}
System.out.println(sum);
}
public static void main(String args[]){
VarArg v=new VarArg();
v.show();
v.show(10,20);
v.show(10,20,30);
}
}