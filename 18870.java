import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        //key = number, value = key
        int[] arr = new int[n];
        int[] original = new int[n];
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
            original[i]= arr[i];
        }

        Arrays.sort(arr);

        int rank=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],rank);
                rank++;
            }
        }

           for(int key : original){
               int result = map.get(key);
               sb.append(result+" ");
           }

        System.out.println(sb);

    }
}
