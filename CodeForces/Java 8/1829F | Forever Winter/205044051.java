 
import java.util.*;
import java.util.stream.Collectors;
 
public class snowflakes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j = 0; j <t ; j++) {
 
            int v=sc.nextInt();
            int m=sc.nextInt();
            ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
 
            for (int i = 1; i <=v+1 ; i++) {
                adjList.add(new ArrayList<>());
            }
 
            for (int i = 0; i <m; i++) {
                int val1=sc.nextInt();
                int val2=sc.nextInt();
                adjList.get(val1).add(val2);
                adjList.get(val2).add(val1);
            }
 
 
            HashMap<Integer,Integer> map=new HashMap<>();
            int indegree[]=new int[v+1];
            for (int i = 1; i <=v ; i++) {
                for (Integer it:
                     adjList.get(i)) {
//                    map.put(i,map.getOrDefault(it,0)+1);
                indegree[it]++;
                }
            }
//            System.out.println(Arrays.stream(indegree).boxed().collect(Collectors.toList()));
 
            for (int it:
                 indegree) {
                if (it == 1 || it == 0) continue;
                if (it != 0) {
                    map.put(it, map.getOrDefault(it, 0) + 1);
                }
            }
            int x=0;
            int y=0;
//            System.out.println(map);
            for (Map.Entry<Integer,Integer> entry:map.entrySet()
                 ) {
                if (entry.getValue()==1){
                    x=(int) entry.getKey();
//                    System.out.print(entry.getKey());
                }
                else if(entry.getKey()!=1) {
                    y=entry.getKey()-1;
//                    System.out.print(" "+(entry.getKey()-1));
                }
            }
            if(x==0) x=y+1;
            System.out.println(x+" "+y);
//            System.out.println(x+" "+y);
        }
 
 
 
    }
}