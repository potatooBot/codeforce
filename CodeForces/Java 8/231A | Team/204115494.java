import java.util.*;
public class team {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
String str[]=new String[n];
int ans=0;
        for (int i = 0; i <n ; i++) {
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            str[i]=String.valueOf(x)+String.valueOf(y)+String.valueOf(z);
        }
        for (int i = 0; i <n ; i++) {
            int count=0;
            for (int j = 0; j <3 ; j++) {
                if(str[i].charAt(j)=='1'){
                    count++;
                }
            }
            if(count>=2) ans++;
        }
        System.out.println(ans);
    }
}