import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        num[0]= Integer.parseInt(st.nextToken());
        num[1]= Integer.parseInt(st.nextToken());

        while(num[0]!=0 && num[1]!=0){


            if(num[1]%num[0]==0){
                System.out.println("factor");
            } else if(num[0]%num[1]==0 && num[0]/num[1]>0){
                System.out.println("multiple");
            }
            else{
                System.out.println("neither");
            }

            st = new StringTokenizer(br.readLine());
            num[0]= Integer.parseInt(st.nextToken());
            num[1]= Integer.parseInt(st.nextToken());
        }
    }
}
