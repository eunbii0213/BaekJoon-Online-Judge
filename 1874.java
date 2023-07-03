import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        //1부터 n까지의 수를 stack에 넣었다가 뽑아 늘어놓음으로써 하나의 수열을 만든다
        //stack에 push하는 순서는 반드시 오름차순을 지키도록 한다
        //임의의 수열이 주어졌을 때 stack을 이용해 그 수열을 만들 수 있는지 없는지, 어떤 순서로 push, pop을 해야하는지 알 수 있다
        //n: 정수들의 개수
        //수열을 이루는 1부터 n이하의 정수가 주어짐
        //만약 target값이 count보다 작고, stack에 있는 값이 더 작다면 수열을 만들 수 없다 >> NO 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 1; //push할 값
        Stack<Integer> stack = new Stack<>();
        HashSet<Integer> poplist = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int target = Integer.parseInt(br.readLine());

            if (count == target) {
                stack.push(count++);
                sb.append("+\n");

                int number = stack.pop();
                poplist.add(number);
                sb.append("-\n");

            } else if (count > target) {
                //이미 꺼낸 값에 target이 있다면 NO를 출력
                if(poplist.contains(target)){
                    System.out.println("NO");
                    return;
                }

                int number = stack.pop();
                poplist.add(number);
                sb.append("-\n");
                while (number > target) {
                    number = stack.pop();
                    poplist.add(number);
                    sb.append("-\n");
                }
            } else if (count < target) {
                int number = count++;
                stack.push(number);
                sb.append("+\n");
                while (number <= target) {
                    if (number == target) {
                        stack.pop();
                        poplist.add(number);
                        sb.append("-\n");
                        break;
                    }

                    number = count++;
                    stack.push(number);
                    sb.append("+\n");
                }
            }
        }

       System.out.print(sb);
    }
}
