import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] days = {
                0, 31, 28, 31, 30,
                31, 30, 31, 31,
                30, 31, 30, 31
        };

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String[] whatDay = {
                " ", "MON", "THU", "THU", "SUN",
                "TUE", "FRI", "SUN", "WED",
                "SAT", "MON", "THU", "SAT"
        };

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        if (y <= days[x]) {
            int check = y % 7;
            //System.out.println("check: " + check);
            String start = whatDay[x];
            //System.out.println("start : " + start);
            String result = "";

            for (int i = 0; i < day.length; i++) {
                if (start.equals(day[i])) {
                    //System.out.println("call");
                    if (i + check - 1 >= 0) {
                        result = day[i + check - 1];
                        break;
                    } else {
                        int temp = i + 7;
                        result = day[temp + check - 1];
                        break;
                    }
                }
            }

            System.out.println(result);
        }
    }
}
