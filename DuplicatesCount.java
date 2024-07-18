import java.util.*;
public class DuplicatesCount{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++){
al.add(s.nextInt());
}
ArrayList<Integer> al2=new ArrayList<Integer>();
for(int i=0;i<al.size();i++){
if(!al2.contains(al.get(i))){
al2.add(al.get(i));
}
}
for(int x:al2){
int c=0;
for(int i=0;i<al.size();i++){
if(al.get(i)==x){
c++;
}
}
System.out.println(x+" "+c);
}
}
}

