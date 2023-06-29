import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }

        int startIndex = 0;
        int endIndex = 0;
        int count = 1;

        while (endIndex < n-1) {
            int sum = 0;
            for (int i = startIndex; i <= endIndex; i++) {
                sum += arr[i];
            }

            if (sum == n) {
                count++;
                startIndex++;
                endIndex++;
            } else if (sum > n) {
                startIndex++;
            } else if (sum < n) {
                endIndex++;
            }
        }

        System.out.println(count);
    }
}
