import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int[] dy = {1, -1, 0, 0};
    public static int[] dx = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int mapSize = Integer.parseInt(br.readLine());
        int[][] map = new int[mapSize][mapSize];

        int maxHeight = 0;
        for (int i = 0; i < mapSize; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < mapSize; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > maxHeight) {
                    maxHeight = map[i][j];
                }
            }
        }

        //1부터 maxHeight까지 비 내리게 해본다
        int max = 0;
        for (int i = 0; i < maxHeight; i++) {
            int result = rain(i, map, mapSize);
            if (result > max) {
                max = result;
            }
        }

        System.out.println(max);
    }

    private static int rain(final int rainHeight, int[][] map, int mapSize) {
        boolean[][] drown = new boolean[mapSize][mapSize];

        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (map[i][j] <= rainHeight) {
                    drown[i][j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                if (!drown[i][j]) {
                    count++;
                    DFS(mapSize, drown, i, j);
                }
            }
        }

        //배열 돌면서 잠겼는지 확인한다.
        return count;
    }

    public static void DFS(int mapSize, boolean[][] drown, int y, int x) {
        drown[y][x] = true;

        for (int dir = 0; dir < 4; dir++) {
            int nowY = y + dy[dir];
            int nowX = x + dx[dir];

            if (nowY >= 0 && nowY < mapSize && nowX >= 0 && nowX < mapSize && !drown[nowY][nowX]) {
                drown[nowY][nowX] = true;
                DFS(mapSize, drown,nowY, nowX);
            }
        }
    }
}
