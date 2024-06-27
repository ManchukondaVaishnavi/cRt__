import java.util.*;
public class AlternateSort{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int j=0;j<n;j++){
a[j]=s.nextInt();
}
Arrays.sort(a);
int i=0,j=n-1,k=1;
while(k<=n/2){
System.out.print(a[j--]+" "+a[i++]+" ");
k=k+1;
}
if(n%2!=0){
System.out.print(a[j]);
}

}
}
