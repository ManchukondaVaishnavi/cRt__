import java.util.*;
public class PositiveMissing{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
Arrays.sort(a);
int i=0;
for(i=0;i<n;i++){
if(a[i]>0){
break;
}
}
int j=i+1;
while(j<n){
if(a[j]==a[j-1]+1){
j++;
}
else{
System.out.print(a[j-1]+1);
return;
}

}
if(j==n){
System.out.print(a[n-1]+1);
}
}
}