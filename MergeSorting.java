import java.util.*;
public class MergeSorting{
static void MergeSort(int a[],int n){
if(n<2){
return;
}
else{
int m=n/2;
int l[]=new int[m];
int r[]=new int[n-m];
for(int i=0;i<m;i++){
l[i]=a[i];
}
for(int i=m;i<n;i++){
r[i-m]=a[i];
}
MergeSort(l,m);
MergeSort(r,n-m);
Merge(a,l,r,m,n-m);
}
}
static void Merge(int a[],int[] l,int[] r,int left,int right){
int i=0,j=0,k=0;
while(i<left&&j<right){
if(l[i]<r[j]){
a[k++]=l[i++];
}else{
a[k++]=r[j++];
}
}
while(i<left){
a[k++]=l[i++];
}
while(j<right){
a[k++]=r[j++];
}
}
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
MergeSort(a,n);
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}
