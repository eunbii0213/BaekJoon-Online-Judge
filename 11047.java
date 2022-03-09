import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int count = 0;

        int[] coin = new int[n];

        //동전 입력받기
        for(int i=0;i<n;i++){
            coin[i]= Integer.parseInt(br.readLine());
        }

        //최소개수의 동전을 구함


            for(int i = n-1; i >= 0; i--){
                int cal = (money /coin[i]);
                if(cal > 0){
                    count += cal;
                    money -= (coin[i]*cal);
                }
            }



        System.out.println(count);

    }
}
