 
import java.util.*;
 
public class lakes {
   static class pair{
        int row,col;
        pair(int row,int col){
            this.row=row;
            this.col=col;
        }
    }
    public static long bfs(int row, int col, ArrayList<ArrayList<Long>> grid, boolean vis[][]){
 
 
        int delrow[]={-1,0,1,0};
        int delcol[]={0,1,0,-1};
 
    Queue<pair> q=new LinkedList<>();
q.add(new pair(row,col));
vis[row][col]=true;
long maxiVolume=0;
while (!q.isEmpty()){
    pair it=q.peek();
    q.remove();
    maxiVolume=maxiVolume+grid.get(it.row).get(it.col);
    for (int i = 0; i <4 ; i++) {
        int neiRow= it.row+delrow[i];
        int neiCol=it.col+delcol[i];
        if(neiRow>=0&&neiCol>=0&&neiRow<grid.size()&&neiCol<grid.get(0).size()&&vis[neiRow][neiCol]==false&&grid.get(neiRow).get(neiCol)!=0){
            q.add(new pair(neiRow,neiCol));
            vis[neiRow][neiCol]=true;
        }
    }
 
}
 
        return maxiVolume;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int k = 0;  k<t ; k++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
 
               ArrayList<ArrayList<Long>> grid=new ArrayList<>();
            for (int i = 0; i < n; i++) {
               grid.add(new ArrayList<>());
            }
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    grid.get(i).add(sc.nextLong());
                }
            }
 
            boolean vis[][] = new boolean[n][m];
            long maxVolume = 0;
            long volume=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
 
                    if (vis[i][j] == false && grid.get(i).get(j) !=0) {
                       volume=bfs(i, j, grid, vis);
                        maxVolume=Math.max(maxVolume,volume);
 
                    }
 
                }
            }
                System.out.println(maxVolume);
        }
 
        }
 
}