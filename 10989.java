import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] array = new int[n];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            array[i] = (Integer.parseInt(br.readLine()));
        }

        Arrays.sort(array);
        for (int i = 0; i < n; i++) {
            sb.append(array[i] + "\n");
        }
        System.out.println(sb);
    }
}
