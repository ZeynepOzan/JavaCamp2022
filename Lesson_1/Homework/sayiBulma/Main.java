package sayiBulma;

public class Main {

	public static void main(String[] args) {
		
		int [] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = 56;
		boolean varMı = false;
		for(int sayi: sayilar) {
			if(sayi == aranacak) {
				varMı = true;
				break;
			}
		}
		
		if(varMı) {
			System.out.println("Sayı Bulundu");
		}
		else {
			System.out.println("Sayı Bulunamadı");
		}

	}

}
