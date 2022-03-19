import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[3][4];

        for (int j = 0; j < 3; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < 4; i++) {
                arr[j][i] = Integer.parseInt(st.nextToken());
            }
        }

        for (int j = 0; j < 3; j++) {
            int one = 0;
            int zero = 0;
            for (int i = 0; i < 4; i++) {
               if(arr[j][i]==0){
                   zero++;
               }else if(arr[j][i]==1){
                   one++;
               }
            }

            if(zero ==1 ){
                System.out.println("A");
            }else if(zero ==2){
                System.out.println("B");
            }else if(zero ==3){
                System.out.println("C");
            }else if(zero ==4){
                System.out.println("D");
            }else if(one ==4){
                System.out.println("E");
            }
        }
    }
}
