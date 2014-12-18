package ArrayUtil;

import java.util.Scanner;

public class UserIspis {

	public static User unosPodataka() {
		User pod = new User();
		Scanner in = new Scanner(System.in);
		System.out.println("Unesi ime: ");
		pod.name = in.next();
		System.out.println("Unesi prezime: ");
		pod.surname = in.next();
		System.out.println("Unesi broj godina: ");
		pod.yearNum = in.nextInt();
		return pod;

	}

	public static void ispis(User pod) {
		System.out.printf("%s %s ima %d  godina\n", pod.name, pod.surname,
				pod.yearNum);
	}

	public static void main(String[] args) {

		User pod0 = unosPodataka();
		User pod1 = unosPodataka();

		ispis(pod0);
		ispis(pod1);
	}
}
