package loopDemo;

public class Main {

	public static void main(String[] args) {

		// for
		System.out.println("For Döngüsü");
		for (int i = 0; i < 10; i += 2) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("For Döngüsü Bitti");

		// While
		int i = 1;
		System.out.println("While Döngüsü");
		while (i < 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		System.out.println("While Döngüsü bitti");

		// Do-While döngüsü
		System.out.println("Do-While Döngüsü");
		int j = 20;
		do {
			System.out.print(j + " ");
			j+=2;
		} while (j < 10);
		System.out.println();
		System.out.println("Do-While Döngüsü Bitti");
	}
}