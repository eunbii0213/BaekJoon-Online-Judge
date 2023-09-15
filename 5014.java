import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    public static int maxHeight;
    public static int startHeight;
    public static int targetHeight;
    public static int upHeight;
    public static int downHeight;
    public static boolean[] visited;
    public static int[] arr;
    public static int[] heightdir;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        maxHeight = Integer.parseInt(st.nextToken());
        startHeight = Integer.parseInt(st.nextToken());
        targetHeight = Integer.parseInt(st.nextToken());

        upHeight = Integer.parseInt(st.nextToken());
        downHeight = Integer.parseInt(st.nextToken());
        heightdir = new int[]{upHeight, downHeight};

        visited = new boolean[maxHeight + 1];
        arr = new int[maxHeight + 1];

        BFS();

        if (visited[targetHeight]) {
            System.out.println(arr[targetHeight]);
        } else {
            System.out.println("use the stairs");
        }
    }

    private static void BFS() {
        Queue<Integer> q = new LinkedList();
        visited[startHeight] = true;
        q.add(startHeight);

        while (!q.isEmpty()) {
            int nowHeight = q.poll();

            for (int i = 0; i < 2; i++) {
                int maybeHeight;
                if(i == 0){
                    maybeHeight = nowHeight + heightdir[i];
                }else {
                    maybeHeight = nowHeight - heightdir[i];
                }

                if( maybeHeight <= maxHeight && maybeHeight > 0 && !visited[maybeHeight]) {
                    q.add(maybeHeight);
                    visited[maybeHeight] = true;
                    arr[maybeHeight] = arr[nowHeight] + 1;
                }
            }
        }

    }
}
