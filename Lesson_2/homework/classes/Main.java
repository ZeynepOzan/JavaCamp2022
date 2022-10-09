package classes;

public class Main {

	public static void main(String[] args) {
		/*
		CustomerManager türünde bir nesne oluşturduk.Bellekte CustomerManager türünde
		nesne oluşturduk
		Classlar referans tiptir.
		Bellekte stack ve heap olmak üzere 2 alan vardır.
		Oluşturduğumuz customerManager ı Stack de oluşturduk. oluşturduğumuz customerManager
		Heapde bulunan nesneyi(new CustomerManager) gösteriyor.
		
		CustumerManager'in referans numarası CustomerManager2'nin referansına eşittir
		Sonuç olarak 2 tane eşit referans numarasına sahip customerManager lar aynı 
		nesneyi gösteriyorlar.
		Eğer herhangi referansı tutan bir nesne yoksa Garbage collector tarafından silinir
		
		*/
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		
		customerManager = customerManager2;
		customerManager.Add();
		customerManager.Remove();
		customerManager.Upsate();
		
		//Value: int,byte,long değer tiplidir
		//Değer tipinde birşey tanımladığımızda bunu stackte oluştururuz.
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		//Diziler referans tiptir. 
		int [] sayilar1 = new int[] {1,2,3,};
		int [] sayilar2 = new int[] {5,5,6,};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
	}
}
