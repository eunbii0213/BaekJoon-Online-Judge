import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N =Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //문제가 숫자일 수도, 문자열일 수도 있어서 hashmap 2개 선언
        HashMap<Integer,String> number = new HashMap<>();
        HashMap<String,Integer> name = new HashMap<>();

        //도감에 등록되어있는 포켓몬 입력
        for(int i=1;i<=N;i++){
            String pocketMon = br.readLine();
            number.put(i,pocketMon);
            name.put(pocketMon,i);
        }

        //문제 입력
        for(int i=0;i<M;i++){
            boolean isNum = false;
            //problem은 숫자 혹은 포켓몬 이름
            String problem = br.readLine();

            //숫자가 입력될 경우 이름을 넣음
            //이름이 입력될 경우 숫자를 넣음
            char ch = problem.charAt(0);
            if(Character.isDigit(ch)){
                int n = Integer.parseInt(problem);
                sb.append(number.get(n)+"\n");
            } else{
                sb.append(name.get(problem)+"\n");
            }

        }

        System.out.println(sb);

    }
}
