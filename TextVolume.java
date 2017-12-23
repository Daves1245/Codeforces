import java.util.Scanner;

public class TextVolume {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		in.nextLine();

		System.out.println(volumeText(in.nextLine()));

	}

	public static int volumeWord(String word) {
		int ret = 0;
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
				ret++;
			}
		}

		return ret;
	}

	public static int volumeText(String word) {
		String[] words = word.split(" ");
		int max = 0;
		for (String s : words) {
			max = Math.max(max, volumeWord(s));
		}

		return max;
	}
}
