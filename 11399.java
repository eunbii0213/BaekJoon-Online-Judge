import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        Integer[] time = new Integer[n];
        Integer[] result = new Integer[n];
        for (int i = 0; i < n; i++) {
            time[i] = Integer.parseInt(st.nextToken());
            result[i] = time[i];
        }

        Arrays.sort(time);

        int sum = 0;
        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i < n; i++) {
               result[i] += time[j];
            }
            sum += result[j];
        }

        System.out.println(sum);
    }
}
