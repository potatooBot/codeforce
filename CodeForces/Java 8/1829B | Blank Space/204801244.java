import java.util.*;
public class blank_space {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
 
        for (int i = 0; i <t ; i++) {
             int n=sc.nextInt();
             int arr[]=new int[n];
             int maxi=0;
            for (int j = 0; j <n ; j++) {
                arr[j]=sc.nextInt();
            }
 
 
            for (int j = 0; j <n ; j++) {
                int count=0;
                if (arr[j] == 0) {
                    for (int k = j; k < arr.length ; k++) {
                        if(arr[k]==0){
 
                            count++;
                        }
                        if(arr[k]==1) break;
                    }
                    maxi=Math.max(maxi,count);
                }
                
            }
            System.out.println(maxi);
        }
 
    }
}