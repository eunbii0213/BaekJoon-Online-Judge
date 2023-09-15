import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    public static List<Integer>[] list;
    public static boolean[] visit;
    public static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nodeCount = Integer.parseInt(br.readLine());
        int branchCount = Integer.parseInt(br.readLine());

        list = new ArrayList[nodeCount + 1];
        visit = new boolean[nodeCount + 1];
        for (int i = 1; i < nodeCount + 1; i++) {
            list[i] = new ArrayList<>();
        }


        for (int i = 0; i < branchCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());


            list[first].add(second);
            list[second].add(first);
        }

        DFS(1);
        System.out.println(count);
    }

    public static void DFS(int startIndex) {
        visit[startIndex] = true;
        for (Integer integer : list[startIndex]) {
            if(!visit[integer]) {
                count++;
                visit[integer] = true;
                DFS(integer);
            }
        }

    }
}
