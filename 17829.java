import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static List<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<n;j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println( re(0, 0, n, (n / 2) * (n / 2)));
    }

    private static int re(int rowIndex, int colIndex, int size, int resultSize) {
        boolean flag = false;
        if (size == 2) {
            flag = true;
        }

        if (flag) {
            //2x2가 되었음
            //2번째로 큰 수 계산
            int[] calculateSecondMax = new int[4];
            int index = 0;
            for (int i = rowIndex; i < rowIndex + size; i++) {
                for (int j = colIndex; j < colIndex + size; j++) {
                    calculateSecondMax[index] = arr[i][j];
                    index++;
                }
            }
            Arrays.sort(calculateSecondMax);
            return calculateSecondMax[2];

        } else {
            //2x2가 아니라면 될 때까지 4분할로 나눈다
            int[] calculateSecondMax = new int[4];

            calculateSecondMax[0] = re(rowIndex, colIndex, size / 2, resultSize);
            calculateSecondMax[1] = re(rowIndex, colIndex + (size / 2), size / 2, resultSize);
            calculateSecondMax[2] = re(rowIndex + (size / 2), colIndex, size / 2, resultSize);
            calculateSecondMax[3] = re(rowIndex + (size / 2), colIndex + (size / 2), size / 2, resultSize);

            Arrays.sort(calculateSecondMax);
            return calculateSecondMax[2];

        }
    }
}
