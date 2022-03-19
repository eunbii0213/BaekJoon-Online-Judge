import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] strTocharArr = str.toCharArray();
        int[] alphabetCount = new int[26];
        char[] alphabet = new char[26];

        int index=0;

        for(int i=97;i<123;i++){
            alphabet[index]=(char)i;
            index++;
        }

        for(int i=0;i<alphabet.length;i++){
            for(int j=0;j<strTocharArr.length;j++){
                if(alphabet[i]==(strTocharArr[j])){
                    alphabetCount[i]++;
                }
            }
        }

        for(int i=0;i< alphabetCount.length;i++){
            System.out.print(alphabetCount[i]+" ");
        }
    }
}
