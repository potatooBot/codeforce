import java.util.*;
import java.util.stream.Collectors;
 
public class way_too_long_words {
    public static void main(String[] args) {
Scanner sca=new Scanner(System.in);
int n= sca.nextInt();
String str[]=new String[n];
        for (int i = 0; i <n ; i++) {
            str[i]= sca.next();
        }
        String ans[]=new String[n];
        for (int i = 0; i <n ; i++) {
            int count=0;
            if(str[i].length()>10){
                ans[i]=str[i].charAt(0)+String.valueOf((str[i].length()-1 )-1) +str[i].charAt(str[i].length()-1);
            }
            else {
                ans[i]=str[i];
            }
        }
        for (int i = 0; i <ans.length ; i++) {
            System.out.println(ans[i]);
        }
    }
}