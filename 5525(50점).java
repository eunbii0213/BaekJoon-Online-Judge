import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int strLength = Integer.parseInt(br.readLine());
        String p1;

        p1 = "I";
        for(int i=0;i<n;i++){
          p1+="OI";
        }


        String[] strArr = new String[2*n+1];
        StringTokenizer st = new StringTokenizer(p1,"IO",true);

        for(int i=0;i<2*n+1;i++){
            strArr[i]=st.nextToken();
        }

        ArrayList<String> list = new ArrayList<>();

        st = new StringTokenizer(br.readLine(),"IO",true);
        for(int i=0; i<strLength; i++){
            list.add(st.nextToken());
        }

        int count = 0;

        //검사 시작
        for(int j = 0; j < strLength-(2*n+1);) {

            int countIndex=0;

            for (int i = j; i < j+(2*n+1); i++) {
                if(i<strLength){
                    if(list.get(i).equals(strArr[countIndex])){
                        countIndex++;
                    }else{ break;}
                }
            }

            if(countIndex==(2*n+1)){
                j+=2;
                count++;
            }else{
                j++;
            }
        }

        System.out.println(count);

    }
}
