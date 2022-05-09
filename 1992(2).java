import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.StringTokenizer;

public class Main {
    public static int[][] arr;
    public static int size;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        size = Integer.parseInt(br.readLine());
        arr = new int[size][size];

        StringTokenizer st;
        for(int i=0;i<size;i++){
            st = new StringTokenizer(br.readLine(),"10",true);
            for(int j=0;j<size;j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        dAndC(0,0,size);
        System.out.println(sb);
    }

    private static void dAndC(int rowIndex, int colIndex, int size) {
        boolean flag = true;
        int target = arr[rowIndex][colIndex];

        Loop1:
        for(int i=rowIndex;i<rowIndex+size;i++){
            for(int j=colIndex;j<colIndex+size;j++){
                if(target!=arr[i][j]){
                    flag = false;
                    break Loop1;
                }
            }
        }

        if(flag){
            sb.append(target);
            return;
        }

        sb.append("(");
        dAndC(rowIndex, colIndex, size/2);
        dAndC(rowIndex, colIndex+size/2, size/2);
        dAndC(rowIndex+size/2, colIndex, size/2);
        dAndC(rowIndex+size/2, colIndex+size/2, size/2);
        sb.append(")");

    }
}
