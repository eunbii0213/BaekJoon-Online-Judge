import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        long mainWatcher = Integer.parseInt(st.nextToken());
        long subWatcher = Integer.parseInt(st.nextToken());

        long count = 0;
        for (int i = 0; i < n; i++) {

            if (mainWatcher >= a[i]) {
                count += 1;
                continue;
            }

            if (mainWatcher + subWatcher >= a[i]) {
                count += 2;
                continue;
            }

            long result = (a[i] - mainWatcher) / subWatcher;
            count += (result + 1);

            if ((a[i] - mainWatcher) % subWatcher > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
