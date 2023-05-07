import java.util.*;
public class love_story {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
 
        String str="codeforces";
        for (int i = 0; i <t ; i++) {
            String s=sc.next();
            int count=0;
            for (int j = 0; j <10 ; j++) {
                if(s.charAt(j)!=str.charAt(j)){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}