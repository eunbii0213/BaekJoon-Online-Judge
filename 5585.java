import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        int[] arr = new int[6];
        int[] coin = new int[6];

        int money = 1000 - n;
        coin[0] = 500; coin[1]=100; coin[2]= 50;
        coin[3] = 10; coin[4] = 5; coin[5]=1;

        while(money>0){
            for(int i=0;i<6;i++){
                if(money>=coin[i]){
                    money-=coin[i];
                    count++;
                    i--;
                }
            }
        }

        System.out.println(count);

    }
}
