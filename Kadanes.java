import java.util.*;
public class Kadanes{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int sum=0,max=Integer.MIN_VALUE;
for(int i=0;i<n-1;i++){

for(int j=i;j<n;j++){
sum=0;
for(int k=i;k<=j;k++){
sum+=a[k];
if(max<sum){
max=sum;
}
}
}
}
System.out.print(max);
}
}