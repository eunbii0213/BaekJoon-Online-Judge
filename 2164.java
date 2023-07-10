import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) throws IOException {
        //큐 >> FIFO >> 처음 넣은 게 가장 먼저 나온다
        // 1부터 N까지의 수 (1번카드가 제일 위)
        //제일 위의 카드 버림
        //그 다음, 제일 위에 있는 카드 밑으로 옮김

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Queue<Integer> q = new LinkedList();

        for (int i = 1; i <= n; i++) {
            q.offer(i);
        }

        while (q.size() > 1) {
            q.poll();
            Integer number = q.poll();
            q.offer(number);
        }

        System.out.println(q.poll());
    }
}
