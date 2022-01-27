import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int count = 0;
    static int r;
    static int c;
    static boolean flag = true;
    static int num;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        num = (int)Math.pow(2,n);

        //r행 c열 숫자 구하기

        if(n==1){
            if(r == 0 && c == 0){
                System.out.println(0);
            }else if(r == 0 && c == 1) {
                System.out.println(1);
            }else if(r == 1 && c == 0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
            return;
        } else{

                re(0,0,0,0,num);


        }



    }
    //num x num크기의 배열이 남아있음을 의미
    public static void re(int leftRow, int leftCol, int rightRow, int rightCol, int num){

        if(num>2) {

            if(r<=leftRow+(num/2)-1 && c<=leftCol+(num/2)-1){
                //1사분면

                re(leftRow+0, leftCol+0, rightRow+(num / 2 - 1), rightCol+(num / 2) - 1, num / 2);
            }else if(r<=leftRow+(num/2)-1 && c>leftCol+(num/2)-1){
                //2사분면
                count+=num/2 * num/2;
                re(leftRow+0, leftCol+(num / 2), rightRow+(num / 2 - 1), rightCol+num - 1, num / 2);

            }else if(r>leftRow+(num/2)-1 && c<=leftCol+(num/2)-1){
                //3사분면
                count+=num/2 * num/2 *2;
                re(leftRow+(num / 2), leftCol+0, rightRow+num - 1, rightCol+num / 2 - 1, num / 2);

            }else{
                //4사분면
                count+=num/2 * num/2 *3;
                re(leftRow+(num / 2), leftCol+(num / 2), rightRow+num - 1, rightCol+num - 1, num / 2);
            }



        }else{
            //여기 진입할 때는 2x2라서 z하나 만들어짐
            z(leftRow,leftCol);


        }

    }

    public static void z(int rowIndex, int colIndex){


        if(rowIndex==r && colIndex==c){
            System.out.println(count);

            System.exit(0);

        }
        count++;

        if(flag){
            flag=false;
            z(rowIndex, colIndex+1);
            z(rowIndex+1, colIndex);
            z(rowIndex+1, colIndex+1);


        }


        return;

    }

}
