import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        try {
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
