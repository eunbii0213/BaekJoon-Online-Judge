import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st;

         int t = Integer.parseInt(br.readLine());

         int[][] conference = new int[t][2];
         //[][0]은 start, [][1]은 end를 나타냄

         int max=0;

         for(int j=0;j<t;j++){

             st = new StringTokenizer(br.readLine());
             int start= Integer.parseInt(st.nextToken());
             int end = Integer.parseInt(st.nextToken());

             conference[j][0]=start;
             conference[j][1]=end;


         }

         //회의가 빨리 끝나는 기준으로 정렬
        Arrays.sort(conference, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {

                if(o1[1]==o2[1]){
                    //회의 끝나는 시간 같은 경우 빨리 시작하는 순으로 정렬
                    return o1[0]-o2[0];
                }
                return o1[1]-o2[1];
            }
        });

         int count=1;
         int prevStart=conference[0][0];
         int prevEnd=conference[0][1];

         for(int i=1;i<t;i++){
             if(conference[i][0]>=prevEnd){
                 count++;
                 prevEnd=conference[i][1];
             }
         }

        System.out.println(count);





    }
}
