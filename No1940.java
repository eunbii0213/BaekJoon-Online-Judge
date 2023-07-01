import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        //갑옷은 2개의 재료로 만든다
        //재료는 각 고유한 번호가 있다
        //2개의 재료의 고유한 번호를 합쳐서 M이 되면 갑옷이 만들어지게 된다
        //주어진 재료들로 갑옷을 몇 개나 만들 수 있을까?

        //N: 재료의 개수
        //M: 갑옷을 만들기 위해 필요한 수(2개의 수를 합쳐서 M이 되어야한다)
        //재료들의 고유한 번호들

        //M이 너무 크다. N도 15000개가 들어올 수 있으므로 two pointer 이용해야할듯

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int startIndex = 0;
        int endIndex = n - 1;
        int count = 0;
        Arrays.sort(numbers);

        while (endIndex > startIndex) {
            if (numbers[startIndex] + numbers[endIndex] == m) {
                count++;
                startIndex++;
                endIndex--;
            } else if (numbers[startIndex] + numbers[endIndex] < m) {
                startIndex++;
            } else if (numbers[startIndex] + numbers[endIndex] > m) {
                endIndex--;
            }

        }
        System.out.println(count);
    }
}
