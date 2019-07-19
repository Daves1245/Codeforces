import java.util.Scanner;
import java.math.BigInteger;

public class A318 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);

                BigInteger n = in.nextBigInteger(), k = in.nextBigInteger();

                if (n.equals(BigInteger.ZERO)) {
                        System.out.println(0);
                        return;
                }

                int mid = (n.divide(BigInteger.valueof(2)) + (n.mod(2));
                if (k <= mid) {
                        System.out.println(2 * k - 1);
                } else {
                        System.out.println((k - mid) * 2);
                }

                in.close();
        }
}
