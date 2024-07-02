import java.util.*;
public class TcsDirection{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
char d='R';
int x=0,y=0,u=10;
for(int i=0;i<n;i++){
if(d=='R'){
x+=u;
u+=10;
d='U';
}
else if(d=='U'){
y+=u;
u+=10;
d='L';
}
else if(d=='L'){
x-=u;
u+=10;
d='D';
}
else if(d=='D'){
y-=u;
u+=10;
d='A';
}
else if(d=='A'){
x+=u;
u+=10;
d='R';
}
}
System.out.println(x+" "+y);
}
}