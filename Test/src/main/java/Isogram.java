import java.util.Scanner;

public class Isogram {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String name = sc.nextLine().toLowerCase();
		int k = 0;
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				if (name.charAt(i) == name.charAt(j)) {
					k = 1;
					break;
				}
			}
		}
		if (k == 0) {
			System.out.println("Isogram");
		} else {
			System.out.println("Not an Isogram");
		}

	}

}
