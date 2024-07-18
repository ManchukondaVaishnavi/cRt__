import java.util.*;
public class RemoveDuplicatesList{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
ArrayList<Integer> al=new ArrayList<>();
for(int i=0;i<n;i++){
al.add(a[i]);
}
ArrayList<Integer> al2=new ArrayList<>();
al2.add(al.get(0));
for(int i=1;i<al.size();i++){
if(!al2.contains(al.get(i))){
al2.add(al.get(i));
}
}
System.out.print(al2);
}
}