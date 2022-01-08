import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int count=0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while(T>0){
            int number = Integer.parseInt(br.readLine());
            count=0;
            re(number);
            System.out.println(count);
            T--;
        }
    }

    //1~3사이면 빼고 0이되면 count++.
    public static void re(int number){

        if(number==0){
            count++;
        }

        if(number>=1){
            re(number-1);
        }

        if(number>=2){
            re(number-2);
        }
        if(number>=3){
            re(number-3);
        }
    }
}
