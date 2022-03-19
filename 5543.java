import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] burger = new int[3];
        int[] drink = new int[2];

        for(int i=0;i<3;i++){
            burger[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(burger);

        for(int i=0;i<2;i++){
            drink[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(drink);

        System.out.println(burger[0]+drink[0]-50);
    }
}
