import java.util.*;
public class HalfSort{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++){
a[j]=s.nextInt();
}
int m;
int mid=n/2;
if(n%2!=0){
m=mid+1;
}
else{
m=mid;
}
for(int i=0;i<m;i++){
for(int j=i+1;j<m;j++){
if(a[i]>a[j]){
int t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}
  