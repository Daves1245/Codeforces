import java.util.Scanner;

public class ChatRoom {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String w = "hello";
		String str = in.nextLine();
		int ind = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == w.charAt(ind)) {
				ind++;
				if(ind > w.length() - 1) {
					System.out.println("YES");
					System.exit(0);
				}
			}
		}
		
		System.out.println("NO");
		
		in.close();
	}
}
