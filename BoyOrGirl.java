import java.util.HashSet;
import java.util.Scanner;

public class BoyOrGirl {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		HashSet<Character> name = new HashSet<Character>();
		String str = in.nextLine();
		for(int i = 0; i < str.length(); i++) {
			name.add(str.charAt(i));
		}
		System.out.println(name.toArray().length % 2 == 0 ? "CHAT WITH HER!" : "IGNORE HIM!");
		
		in.close();
	}
}
