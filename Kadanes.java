import java.util.*;
public class Kadanes{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int gs=0,cs=0;
for(int i=0;i<n;i++){
cs+=a[i];
if(gs<cs){
gs=cs;
}
if(cs<0){
cs=0;
}
}
System.out.print(gs);
}
}
