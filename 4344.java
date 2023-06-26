import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    //C = test case 수
    //N = 각 학생의 수, 이어서 N명의 점수 출력(정수)
    //평균을 넘는 학생들의 비율을 소수점 셋째자리까지 출력

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            String score = br.readLine();
            StringTokenizer st = new StringTokenizer(score);
            int n = Integer.parseInt(st.nextToken(" "));
            int[] scores = new int[n];
            int sum = 0;
            double avg = 0;

            for (int j = 0; j < n; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
                sum += scores[j];
            }
            avg = sum / n;
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (scores[j] > avg) {
                    count++;
                }
            }

            double percent = count * 100 /(double) n ;
            
            System.out.println(String.format("%.3f", percent)+"%");
        }
    }
}
