import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        BigInteger[] fibo = new BigInteger[n + 1];
        fibo[0] = BigInteger.ZERO;
        fibo[1] = BigInteger.ONE;

        int index = 2;
        while (true) {
            if (index > n) {
                break;
            }
            fibo[index] = fibo[index - 2].add(fibo[index - 1]);
            index++;
        }
        System.out.println(fibo[n]);
    }
}
