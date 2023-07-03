import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static int passwordCount = 0;
    public static int count = 0;
    public static int targetCount = 0;

    public static void main(String[] args) throws IOException {
        //문자열에 등장하는 모든 문자가 A,C,G,T
        //AAAA같은 보안에 취약한 비밀번호가 만들어 질 수 있다 >> 문자 개수가 특정 개수 이상이어야 비밀번호로 사용가능
        //비밀번호의 종류의 수를 구하라

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        //st = new StringTokenizer(br.readLine(),"");
        String[] arr = new String[s];
        String inputString = br.readLine();
        for (int i = 0; i < s; i++) {
            arr[i] = String.valueOf(inputString.charAt(i));
        }

        st = new StringTokenizer(br.readLine(), " ");
        int[] compare = new int[4];
        compare[0] = Integer.parseInt(st.nextToken());
        compare[1] = Integer.parseInt(st.nextToken());
        compare[2] = Integer.parseInt(st.nextToken());
        compare[3] = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 4; i++) {
            if (compare[i] > 0) {
                targetCount++;
            }
        }

        int[] my = new int[4];
        for (int i = 0; i < p; i++) {
            String now = arr[i];
            add(compare, my, now);
        }

        for (int i = 0; i < 4; i++) {
            if (compare[i] == 0) {
                passwordCount++;
            }
        }

        int startIndex = 0;
        int endIndex = p - 1;

        while (endIndex < arr.length) {
            //System.out.println(endIndex + ":" + my[0] + "," + my[1] + "," + my[2] + "," + my[3]);
            //System.out.println(endIndex + ":" + compare[0] + "," + compare[1] + "," + compare[2] + "," + compare[3]);
            //System.out.println(passwordCount);
            if (passwordCount == 4) {
                count++;
            }
            remove(arr, startIndex, my, compare);
            startIndex++;
            endIndex++;
            add2(arr, compare, endIndex, my);
        }
        System.out.println(count);
    }

    private static void add2(String[] arr, int[] compare, int endIndex, int[] my) {
        if (endIndex < arr.length) {
            switch (arr[endIndex]) {
                case "A":
                    my[0]++;
                    if (my[0] == compare[0]) {
                        passwordCount++;
                    }
                    break;

                case "C":
                    my[1]++;
                    if (my[1] == compare[1]) {
                        passwordCount++;
                    }
                    break;

                case "G":
                    my[2]++;
                    if (my[2] == compare[2]) {
                        passwordCount++;
                    }
                    break;

                case "T":
                    my[3]++;
                    if (my[3] == compare[3]) {
                        passwordCount++;
                    }
                    break;
            }
        }
    }

    private static void remove(String[] arr, int startIndex, int[] my, int[] compare) {
        switch (arr[startIndex]) {
            case "A":
                if (my[0] == compare[0]) {
                    passwordCount--;
                }
                my[0]--;
                break;

            case "C":
                if (my[1] == compare[1]) {
                    passwordCount--;
                }
                my[1]--;
                break;

            case "G":
                if (my[2] == compare[2]) {
                    passwordCount--;
                }
                my[2]--;
                break;

            case "T":
                if (my[3] == compare[3]) {
                    passwordCount--;
                }
                my[3]--;
                break;
        }
    }


    private static void add(int[] compare, int[] my, String now) {
        switch (now) {
            case "A":
                my[0]++;
                if (my[0] == compare[0]) {
                    passwordCount++;
                }
                break;

            case "C":
                my[1]++;
                if (my[1] == compare[1]) {
                    passwordCount++;
                }
                break;

            case "G":
                my[2]++;
                if (my[2] == compare[2]) {
                    passwordCount++;
                }
                break;
            case "T":
                my[3]++;
                if (my[3] == compare[3]) {
                    passwordCount++;
                }
                break;

        }
    }
}
