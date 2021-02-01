import java.math.BigInteger;
import java.util.*;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		
			Scanner scanner = new Scanner(System.in);
			
			BigInteger a=scanner.nextBigInteger();
			BigInteger b=scanner.nextBigInteger();
			BigInteger result = a.add(b);
			System.out.println(result);
	}
}
