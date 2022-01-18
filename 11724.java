import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.*;


public class Main {
    static int n; //vertex
    static int m; //edge
    static int arr[][]; //adjacent matrix
    static int count=0; //connected component
    static boolean visit[]; //check visit
 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n= Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = new int[n+1][n+1];
        visit = new boolean[n+1];

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());

            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            arr[y][x] = arr[x][y] = 1; //bi-directional
        }



        for(int i=1;i<n+1;i++){
           if(!visit[i]){
               bfs(i);
               count++;
           }


        }
        System.out.println(count);



    }

    public static void bfs(int index){
        Queue<Integer> q = new LinkedList<>();
        q.offer(index);
        visit[index] = true;

        while(!q.isEmpty()){
            int now = q.poll();

            for(int i=1;i<n+1;i++){
                if(arr[now][i]==1 && !visit[i]){
                    q.offer(i);
                    visit[i]=true;
                }
            }
        }
    }


}
