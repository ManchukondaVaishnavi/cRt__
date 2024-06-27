import java.util.*;
public class MergeSortedArray{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int a[]=new int[m];
for(int i=0;i<m;i++){
a[i]=s.nextInt();
}
int n=s.nextInt();
int b[]=new int[n];
for(int i=0;i<n;i++){
b[i]=s.nextInt();
}
int c[]=new int[m+n];

int i=0,k=0,j=0;
while(k<m+n&&i<m&&j<n){
if(a[i]<b[j]){
c[k]=a[i];
i++;
}else{
c[k]=b[j];
j++;
}
k++;
}
if(k<m+n&&i<m){
while(i<m){
c[k]=a[i];
i++;
k++;
}
}
if(k<m+n&&j<n){
while(j<n){
c[k]=b[j];
k++;
j++;
}
}
for(i=0;i<m+n;i++){
System.out.print(c[i]+" ");
}
}
}