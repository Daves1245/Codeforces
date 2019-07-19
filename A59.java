import java.util.Scanner;

public class A59 {
        public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                String line = in.nextLine();
                int l_count = 0;
                int u_count = 0;
                for (int i = 0; i < line.length(); i++) {
                        if (Character.isUpperCase(line.charAt(i))) {
                                u_count++;
                        } else {
                                l_count++;
                        }
                }

                if (u_count > l_count) {
                        System.out.println(line.toUpperCase());
                } else {
                        System.out.println(line.toLowerCase());
                }
        }
}
