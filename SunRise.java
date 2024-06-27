import java.util.*;
public class SunRise{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int c=1;
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
for(int i=1;i<n;i++){
int j=0;
while(a[i]>a[j]&&j<i){
    j++;
}
if(i==j){
c++;
}
}
System.out.print(c);
}
}

