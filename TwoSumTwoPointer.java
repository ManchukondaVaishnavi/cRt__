import java.util.*;
public class TwoSumTwoPointer{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
int k=s.nextInt();
int l=0,h=n-1;
while(l<h){
if(a[l]+a[h]==k){
System.out.print(l+" "+h);
return;
}
else if(a[l]+a[h]<k){
l++;
}
else{
h--;
}
}
}
}