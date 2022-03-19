import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dice = new int[10];
        int[] get = new int[3];

        for (int i = 1; i < 10; i++) {
            dice[i] = i;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            get[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(get);

        int count = 0;
        int same = 0;

        for (int i = 0; i < 2; i++) {
            if (get[i] == get[i + 1]) {
                count++;
                same = get[i];
            }
        }

        if(count==2){
            System.out.println(10000+same*1000);
        }else if(count==1){
            System.out.println(1000+(same)*100);
        }else{
            System.out.println(get[2]*100);
        }

    }
}
