import java.util.*;
public class ListOperations{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
ArrayList<Integer> al=new ArrayList<Integer>();
for(int i=0;i<n;i++){
al.add(s.nextInt());
}
System.out.println(al);
al.remove(1);
System.out.println(al);
System.out.println("First index:"+al.get(1));
al.set(1,12);
System.out.println(al);
System.out.println("First index:"+al.get(1));
System.out.println("Size of list:"+al.size());
Collections.sort(al);
System.out.println("After sorting:"+al);
System.out.println(al.contains(4));
al.removeAll(al);
System.out.println("After removing all elements :"+al);
}
}