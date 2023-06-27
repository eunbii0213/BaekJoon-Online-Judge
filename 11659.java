import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //N: 수의 개수, M:합을 구해야 하는 횟수
        //N개의 수
        //합을 구해야하는 구간 i, j


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> sum = new ArrayList<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(n == m && n == 1){
            System.out.println(n);
            return;
        }

        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        list.add(0);
        for (int i = 1; i < n+1; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        sum.add(list.get(0));
        sum.add(list.get(1));
        for (int i = 2; i < n+1; i++) {
            sum.add(list.get(i) + sum.get(i-1));
        }


        for (int count = 0; count < m; count++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            //j까지의 sum을 구하고
            //0부터 i까지의 합은 빼준다

            System.out.println(sum.get(j) - sum.get(i-1));
        }
    }
}
