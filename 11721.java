import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int start = 0;
        int end = 10;
        while(true){
            if(end>=str.length() && str.substring(start,str.length()).length()< 10){
                System.out.println(str.substring(start,str.length()));
                break;
            }
            String temp = str.substring(start,end);
            System.out.println(temp);

            start+=10;
            end+=10;

        }
    }
}
