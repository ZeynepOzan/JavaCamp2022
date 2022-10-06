package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "Ayşe";
		String ogrenci2 = "Ali";
		String ogrenci3 = "Fatma";
		String ogrenci4 = "Ahmet";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("***************************");

		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ayşe";
		ogrenciler[1] = "Ali";
		ogrenciler[2] = "Fatma";
		ogrenciler[3] = "Ahmet";

		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.print(ogrenciler[i] + " ");
		}
		System.out.println();
		System.out.println("***************************");
		for(String ogrenci: ogrenciler) {
			System.out.print(ogrenci + " ");
		}
	}

}
