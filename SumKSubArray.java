import java.util.*;
public class SumKSubArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int sum=0;
int k=s.nextInt();
int tar=s.nextInt();
int i=0;
for(i=0;i<=n-k;i++){
sum=0;
for(int j=i;j<i+k;j++){
sum+=a[j];}
if(sum==tar){
System.out.print("YES");
return ;
}
}
if(i==n-k+1){
System.out.print("No");
}
}
}
