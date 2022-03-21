import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for (int j = 0; j < num; j++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
           int count= st.countTokens();
            while (count>0) {
                StringBuffer sb = new StringBuffer(st.nextToken());
                String reverse = sb.reverse().toString();
                System.out.print(reverse+" ");
                count--;
            }
        }
    }
}
