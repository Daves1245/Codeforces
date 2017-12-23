import java.util.Scanner;

public class StringTask {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String str = in.nextLine().toLowerCase();

		str = str.replaceAll("a", "");
		str = str.replaceAll("A", "");
		str = str.replaceAll("e", "");
		str = str.replaceAll("E", "");
		str = str.replaceAll("i", "");
		str = str.replaceAll("I", "");
		str = str.replaceAll("o", "");
		str = str.replaceAll("O", "");
		str = str.replaceAll("u", "");
		str = str.replaceAll("U", "");
		str = str.replaceAll("Y", "");
		str = str.replaceAll("y", "");

		StringBuilder strbldr = new StringBuilder("");

		for (int i = 0; i < str.length(); i++) {
			strbldr.append("." + str.charAt(i));
		}

		System.out.println(strbldr);
		in.close();
	}
}