import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("masukan perulang?");
		int k = new Scanner(System.in).nextInt();
		for (int i = 0; i < k; i++) {

			System.out.println("number ke"+ i);
		}		
		System.out.println("dari server, eh lokal");
	}
}
