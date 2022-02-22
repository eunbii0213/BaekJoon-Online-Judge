import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());

        while(t>0){

            //key = 종류, value = 해당 종류 옷 개수
            HashMap<String,Integer> check = new HashMap<>();
            int n = Integer.parseInt(br.readLine());
            if(n==0){
                sb.append(0+"\n");
                t--;
                continue;
            }

            int typeCount = 0; //옷의 종류
            ArrayList<String> typeArr = new ArrayList<>();

            for(int i=0;i<n;i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                String value = st.nextToken();
                String key = st.nextToken();

                //check맵에 해당 종류가 있다면 옷 개수를 늘려준다.
                if (check.containsKey(key)) {
                    check.put(key, check.get(key) + 1);
                } else {
                    //check맵에 해당 종류가 없다면 추가해주고 typeCount++.
                    check.put(key, 1);
                    typeCount++;
                    typeArr.add(key);
                }

            }
            if(typeCount==1){
                sb.append(n+"\n");
            }else{
                int result = 1;
                for(int i = 0; i < typeCount; i++){
                    //null값 포함(+1)하여 경우의 수 구함 
                   result *= (check.get(typeArr.get(i))+1);
                }

                //아무것도 입지 않는 경우 빼줌(-1)
                sb.append(result-1 + "\n");
            }

            t--;
        }

        System.out.print(sb);
    }
}
