import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count=0;

        while(st.hasMoreTokens()){
            int compare = Integer.parseInt(st.nextToken());
            if(compare==num){
                count++;
            }
        }

        System.out.println(count);
    }
}
