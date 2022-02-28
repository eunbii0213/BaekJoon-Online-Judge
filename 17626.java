import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        //dp[i]에는 숫자 넣어짐(제곱되는 숫자의 개수)

        int[] dp = new int[n+1];
        dp[0]=0; dp[1]=1;

        for(int i=2;i<n+1;i++){
            int min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++){
                min=Math.min(dp[(i-j*j)],min);
                //i=27이라면 (dp[26],min) (dp[25],min) (dp[24],min) (dp[11],min) (dp[2],min)
            }   //            j=1           j=2          j=3        j=4           j=5 (2)
            dp[i]=min+1;
        }

        System.out.println(dp[n]);

    }
}
