import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[n]; //인출에 걸린 시간
        int sum=0; // 총 걸린 시간 (인출시간 + 대기시간)
        int wait=0; // 총 대기시간

        int count=0;
        int lastPeople= n-1;//남은 대기인원

        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
            sum+=arr[i];
        }
        Arrays.sort(arr);


        for(int i=0;i<n-1;i++){
            wait += (lastPeople*arr[i]); //j번째 사람이 인출하는데 걸린시간이 모두가 대기한 시간. (n-1)*arr[j];

            lastPeople--;
        }

        System.out.println(sum+wait);



    }
}
