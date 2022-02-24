import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        int count=0;
        int tempCount=0;
        for(int i=1;i<m-1;i++){
            if(arr[i-1]=='I' && arr[i]=='O' && arr[i+1]=='I'){
                tempCount++;
                if(tempCount==n){
                    tempCount--;
                    count++;
                   
                }
                i++;
            }else{ tempCount=0; }
        }

        System.out.println(count);

    }
}
