import java.util.*;
public class Bubble{
static void BubbleSort(int a[],int n){
for(int i=n-1;i>0;i--){
for(int j=0;j<i;j++){
if(a[j]>a[j+1]){
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
System.out.print("Before swap\n");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
System.out.println();
BubbleSort(a,n);
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}