import java.util.Scanner;
import java.util.StringBuilder;

public class A208 {
        public static void main(Strin[] args) {
                Scanner in = new Scanner(System.in);
                
                String line = in.nextLine();
                StringBuilder original = new StringBuilder("");
                int index = 0;
                while (line.substring(index, index + 3).equals("WUB")) i = i + 3;
                System.out.println(line.substring(index));

                in.close();
        }
}
