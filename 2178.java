import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon2178_MazeSearch {

    static int[] dr = {1,-1,0,0};
    static int[] dc = {0,0,-1,1};
    static boolean[][] visited;
    static int[][] map;
    static int N,M;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String line = st.nextToken();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0';
            }
        }

        bfs(0,0);

        System.out.println(map[N-1][M-1]);
    }

    public static void bfs(int i, int j){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i,j});

        while(!q.isEmpty()){
            int location[] = q.poll();
            visited[i][j] = true;

            for(int dir = 0; dir<4; dir++){
                int r = location[0] + dr[dir];
                int c = location[1] + dc[dir];

                //좌표가 -1이 되거나 N or M이 되어 map의 범위를 벗어나면 안되므로
                if(r >= 0 && c >= 0 && r < N && c < M){
                    if(map[r][c] != 0 && !visited[r][c]){
                        q.offer(new int[] {r,c});
                        visited[r][c] = true;
                        map[r][c] = map[location[0]][location[1]] + 1;
                    }
                }
            }
        }
    }
}
