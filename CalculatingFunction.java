import java.math.BigInteger;
import java.util.Scanner;

public class CalculatingFunction {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		BigInteger n = new BigInteger(in.nextLine());
		if(n.mod(BigInteger.valueOf(2)).compareTo(BigInteger.ZERO) == 0) {
			
			System.out.println(n.divide(BigInteger.valueOf(2)));
		}
		else {
			System.out.println(n.add(BigInteger.ONE).divide(BigInteger.valueOf(-2)));
		}
		in.close();
	}
}
