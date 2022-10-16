package YouTubeEgitim_;

public class Main {
	public static void main(String[] args) {

		// Referans Tipleri
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2;
		sayi2 = 100;
		System.out.println(sayi1);

		int[] sayilar1 = { 1, 2, 3 };
		int[] sayilar2 = { 10, 20, 30 };
		// Sayılar1 in referans numarasını sayılar2 nin referans
		// numarasına eşittir.

		sayilar1 = sayilar2;
		sayilar2[0] = 1000;

		System.out.println(sayilar1[0]);
	}
}
