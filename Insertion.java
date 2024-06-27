import java.util.*;
public class Insertion{
static void Insertionsort(int a[],int n){
for(int i=1;i<n;i++){
int j=i;
while(j>0&&a[j]<a[j-1]){
int t=a[j];
a[j]=a[j-1];
a[j-1]=t;
j--;
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
System.out.print("Before sort\n");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
Insertionsort(a,n);
System.out.println();
System.out.print("After sort\n");
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}