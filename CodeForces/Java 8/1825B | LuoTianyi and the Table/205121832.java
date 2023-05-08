 
import java.util.Arrays;
import java.util.Scanner;
 
public class LuoTianyi_and_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i <t ; i++) {
            int n= sc.nextInt();
            int m= sc.nextInt();
        int arr[]=new int[n*m];
            for (int j = 0; j <n*m ; j++) {
arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            int x=arr[n*m-1];
            int p=arr[0];
            int q=arr[1];
            int y=arr[n*m-2];
            int count=(n-1)*(x-q);
 
            count+=(n)*(m-1)*(x-p);
 
            int ans=(n-1)*(y-p);
            ans+=(m-1)*n*(x-p);
 
            int temp=n;
            n=m;
            m=temp;
 
            int count2=(n-1)*(x-q);
            count2+=(n)*(m-1)*(x-p);
 
 
            int ans2=(n-1)*(y-p);
 
            ans2+=(m-1)*n*(x-p);
            int val=Math.max(Math.max(ans,ans2),Math.max(count,count2));
            System.out.println(val);
 
 
        }
    }
}