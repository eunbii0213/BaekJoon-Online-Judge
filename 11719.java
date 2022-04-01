import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            if(str.equals("")){
                System.out.println();
                continue;
            }
            System.out.println(str);

        }
    }
}
