import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] arr = new int[n + 1]; //0~n값 저장
        int[] sum = new int[n + 1];

        arr[0]=0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        sum[0] = 0;
        sum[1]= arr[1];

        for (int i = 2; i < n + 1; i++) {
            sum[i] = sum[i-1] + arr[i];
        }

        int result = 0;
        while (m > 0) {
            st = new StringTokenizer(br.readLine());
            int startIndex = Integer.parseInt(st.nextToken());
            int endIndex = Integer.parseInt(st.nextToken());

            if(startIndex == endIndex){
                System.out.println(arr[startIndex]);
                m--;
                continue;
            }

            result = sum[endIndex]-sum[startIndex-1];

            System.out.println(result);
            m--;
        }
    }
}
