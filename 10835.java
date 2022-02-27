import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static int[] left;
    static int[] right;
    static int[][] dp;
    static int N;

    public static int getMaxScore(int leftCardIndex, int rightCardIndex) {

        //case 1: 왼쪽 카드만 버리기
        //case 2: 왼쪽 , 오른쪽 카드 둘 다 버리기
        //case 3: 오른쪽 카드만 버리기

        if(leftCardIndex==N || rightCardIndex==N) {
            //왼쪽 더미 혹은 오른쪽 더미가 바닥나면 게임 종료
            return 0;
        }//종료조건

        if(dp[leftCardIndex][rightCardIndex]!= -1){
            return dp[leftCardIndex][rightCardIndex];
        }
        int case1 = getMaxScore(leftCardIndex+1,rightCardIndex);
        int case2 = getMaxScore(leftCardIndex+1,rightCardIndex+1);
        dp[leftCardIndex][rightCardIndex] = Math.max(case1,case2);

        if(right[rightCardIndex]<left[leftCardIndex]) {
            int case3 = getMaxScore(leftCardIndex,rightCardIndex+1)+right[rightCardIndex];
           dp[leftCardIndex][rightCardIndex] = Math.max(dp[leftCardIndex][rightCardIndex],case3);
        }
        return dp[leftCardIndex][rightCardIndex];

    }

    public static void main(String[] args) throws NumberFormatException, IOException, IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N=Integer.parseInt(br.readLine());

        dp = new int[N][N];
        left = new int[N];
        right = new int[N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                dp[i][j]=-1;
            }
        }
        //맨 마지막에 들어온 카드가 맨 위의 카드가 된다.
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            left[i]=Integer.parseInt(st.nextToken());
        }//왼쪽 카드


        st= new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++) {
            right[i]=Integer.parseInt(st.nextToken());
        }//오른쪽 카드

        System.out.println(getMaxScore(0,0));

    }
}
