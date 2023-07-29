import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"1|2|3|4|5|6|7|8|9|0", true);
        Integer[] arr = new Integer[st.countTokens()];
        int count = 0;

        while (st.hasMoreTokens()) {
            arr[count] = Integer.parseInt(st.nextToken());
            count++;
        }

        Arrays.sort(arr, Collections.reverseOrder());
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i]);
        }
    }
}
