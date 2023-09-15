import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int nodeCount = Integer.parseInt(st.nextToken());
        int branchCount = Integer.parseInt(st.nextToken());

        boolean[] visit = new boolean[nodeCount + 1];
        List<Integer>[] list = new ArrayList[nodeCount + 1];
        for (int i = 0; i < nodeCount + 1; i++) {
            list[i] = new ArrayList<>();
        }

        for (int i = 0; i < branchCount; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            list[first].add(second);
            list[second].add(first);
        }

        for (int i = 1; i < nodeCount + 1; i++) {
            if (!visit[i]) {
                count++;
                DFS(i, visit, list[i], list);
            }
        }

        System.out.println(count);
    }

    public static void DFS(int start, boolean[] visit, List<Integer> list, List<Integer>[] list2) {
        visit[start] = true;


        for (Integer integer : list) {
            if (!visit[integer]) {
                visit[integer] = true;
                DFS(integer, visit, list2[integer], list2);
            }
        }
       
    }
}
