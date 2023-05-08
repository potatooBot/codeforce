 
import java.util.*;
public class LuoTianyi_and_the_Palindrome_String {
    static int lcsUtil(String s1, String s2, int ind1, int ind2, int[][] dp){
 
        if(ind1<0 || ind2<0)
            return 0;
 
        if(dp[ind1][ind2]!=-1)
            return dp[ind1][ind2];
 
        if(s1.charAt(ind1) == s2.charAt(ind2))
            return dp[ind1][ind2] = 1 + lcsUtil(s1,s2,ind1-1,ind2-1,dp);
 
        else
            return dp[ind1][ind2] = 0 + Math.max(lcsUtil(s1,s2,ind1,ind2-1,dp),
                    lcsUtil(s1,s2,ind1-1,ind2,dp));
 
    }
 
 
    static int lcs(String s1, String s2) {
 
        int n=s1.length();
        int m=s2.length();
 
        int dp[][]=new int[n][m];
        for(int rows[]: dp)
            Arrays.fill(rows,-1);
        return lcsUtil(s1,s2,n-1,m-1,dp);
    }
 
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
        for (int l = 0; l <t ; l++) {
         String str=sc.next();
         StringBuilder sb=new StringBuilder(str);
         String s2=sb.reverse().toString();
         int res=lcs(str,s2);
         HashSet<Character> set=new HashSet<>();
            for (int i = 0; i <s2.length() ; i++) {
                set.add(str.charAt(i));
            }
            if(set.size()==1) System.out.println(-1);
            else {
                System.out.println(res-1);
            }
        }
 
       
    }
}