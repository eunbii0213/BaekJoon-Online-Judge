import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static List<Integer>[] arr;
    public static boolean[] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        visit = new boolean[n + 1];
        arr = new ArrayList[n + 1];
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n + 1; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            arr[s].add(e);
            arr[e].add(s);
        }

        int count = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visit[i]) {
                count++;
            }
            DFS(i);
        }

        System.out.println(count);
    }

    private static void DFS(final int i) {
        if (visit[i]) {
            return;
        }
        visit[i] = true;
        for (Integer integer : arr[i]) {
            if(visit[integer] == false){
                DFS(integer);
            }
        }
    }
}
